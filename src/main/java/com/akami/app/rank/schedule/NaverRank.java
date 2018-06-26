package com.akami.app.rank.schedule;

import com.akami.app.rank.domain.*;
import com.akami.app.rank.domain.mapper.TimeMapper;
import com.akami.app.rank.service.Rank;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class NaverRank extends Rank {
    @Autowired
    TimeMapper timeMapper;

    private String rankSearchUrl = "https://www.naver.com/index.html";
    private String realationSearchUrl = "https://search.naver.com/search.naver?query=";
    private final static String NAVER_NEWS_RSS = "http://newssearch.naver.com/search.naver?where=rss&query=";

    private final static String PORTAL = "NAVER";
    private final static String TYPE = "REALTIME";
    private StringBuffer realationWord ;
    private final static String NAVER_IMAGE = "https://m.search.naver.com/search.naver?where=m_image&query=";


    @Autowired
    ImageRepository imageRepository;

    @Autowired
    WordRepository wordRepository;

    @Autowired
    NewsRepository newsRepository;

    @Override
    @Transactional
    @Scheduled(initialDelay = 1000, fixedDelay = 60000)
    public void setRankList() {
        Document rankWords = getDocument(rankSearchUrl, null);

        //System.out.println(rankWords);
        //실시간 검색어 가지고오기
        System.out.println("STEP 0. 실시간 검색어 가지고오기");
        Elements elements = rankWords.select("span.ah_k");
        //System.out.println(elements);
        int rankindex = 1;
        String keyword ;
        String relationWord ;
        Word word ;

        //기준 시간 잡기
        Timestamp now =  timeMapper.getTime();
        System.out.println("now ==============="+now.toString());
        newsRepository.deleteAll();
        imageRepository.deleteAll();
        //STEP 1. 실시간 검색어 담기
        //System.out.println("STEP 1. 실시간 검색어 담기");
        for (Element e : elements) {
            //System.out.println(rankindex +" : "+ e.html());
            int NEWS_CNT = 5;
            int IMAGE_CNT = 5;
            keyword = e.html();

            //STEP 2. 연관 검색어 주어 담기
            realationWord = new StringBuffer();
            rankWords = getDocument(realationSearchUrl,keyword);
            Elements reEl = rankWords.select("ul._related_keyword_ul > li");

            for (Element re : reEl) {
                // System.out.println(rankindex +" : "+ Jsoup.clean( re.html(), Whitelist.none()));
                relationWord = Jsoup.clean( re.html(), Whitelist.none());
                realationWord.append(relationWord+"|");
            }

            rankList.add(new Word(TYPE, rankindex, keyword, realationWord.toString()));
            word = new Word();
            word.setId(rankindex);
            word.setRankIndex(rankindex);
            word.setCrawlerTime(new Timestamp(System.currentTimeMillis()));
            word.setPortal(PORTAL);
            word.setType(TYPE);
            word.setSearchWord(keyword);
            //System.out.println("realationWord.toString() : "+realationWord.toString());
            word.setRelationWord(realationWord.toString());
            wordRepository.save(word);

            //STEP 3. News 주어 담기
            //System.out.println("STEP 2. News 주어 담기");
            Document newsDoc = getDocument(NAVER_NEWS_RSS, keyword);
            Elements newses  = newsDoc.select("item");
            //System.out.println("*news count  : "+ newses.size());

            News news ;

            if(NEWS_CNT > newses.size()) NEWS_CNT= newses.size();

            for(int i = 0 ; i < NEWS_CNT ; i++){
                news = new News();

                news.setTitle(newses.get(i).select("title").text());
                //System.out.println(word.getSearchWord() + "      : Title : "+newses.get(i).select("title").text());
                news.setLink(newses.get(i).select("link").text());
                news.setDescription(newses.get(i).select("description").text());
                SimpleDateFormat dateformat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
                try {
                    Date pubDate = dateformat.parse(newses.get(i).select("pubDate").text());
                    Timestamp timestamp = new java.sql.Timestamp(pubDate.getTime());
                    news.setPubDate(timestamp);
                } catch (ParseException ee) {
                    ee.printStackTrace();
                }
                news.setAuthor(newses.get(i).select("author").text());
                news.setKeyword(keyword);
                news.setPortal(PORTAL);
                news.setRankIndex(rankindex);
                news.setThumbnail(newses.get(i).select("media").attr("url"));
                news.setCategory(newses.get(i).select("category").text());
                news.setRegDate(new Timestamp(System.currentTimeMillis()));
                //System.out.println(news.toString());
                newsRepository.save(news);
            }

            //System.out.println("STEP 3. IMAGE 수집");
            //STEP 4. IMAGE 수집
            Document imageDoc = getDocument(NAVER_IMAGE, keyword);
            //System.out.println("------------newsDoc---------");
            // System.out.println(imageDoc);
            Elements images  = imageDoc.select("div.photo_grid img");
            //System.out.println("---------------------");
            //System.out.println(images);

            Image image;
            if(images.size()  > 0 && rankindex ==1 ){
                //기존 이미지 삭제
                imageRepository.deleteAll();
            }
            if(IMAGE_CNT > images.size()) IMAGE_CNT= images.size();

            for(int i = 0 ; i < IMAGE_CNT ; i++){
                image = new Image();
                image.setKeyword(keyword);
                image.setPortal("NAVER");
                image.setRankIndex(rankindex);
                //image.setTitle();
                //System.out.println("[===> ]"+images.get(i).attr("data-source"));
                image.setUrl(images.get(i).attr("data-source"));
                image.setType("NR");
                imageRepository.save(image);
            }

         rankindex++;

            if(rankindex  == 21) break;
        }


        //for(Word word2 : rankList) {
        //    System.out.println(word2);
        //}
        rankList.clear();

    }




    @Scheduled(initialDelay = 1000, fixedDelay = 60000)
    public void sayHello(){
        System.out.println("say Hello : "+timeMapper.getTime());
    }
}
