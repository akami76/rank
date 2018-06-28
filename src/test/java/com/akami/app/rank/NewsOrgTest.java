package com.akami.app.rank;

import com.akami.app.rank.domain.News;
import com.akami.app.rank.domain.NewsRepository;
import com.akami.app.rank.service.Rank;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsOrgTest extends Rank {
    private final static String NAVER_NEWS_ORG = "https://m.search.naver.com/search.naver?query=";
    private  static int NEWS_CNT = 5;

    @Autowired
    NewsRepository newsRepository;

    @Test
    @Override
    public void setRankList() {

        String keyword = "이태임";

        Document newsDoc = getDocument(NAVER_NEWS_ORG, keyword);
        System.out.println("------------newsDoc---------");
        //System.out.println(newsDoc);
        Elements items  = newsDoc.select(".list_news li.bx");
        //System.out.println("-------------news list--------");
        //System.out.println(items);
        if(NEWS_CNT > items.size()) NEWS_CNT= items.size();
        News news ;
        for(int i = 0 ; i < NEWS_CNT ; i++){
            System.out.println(i+" : -------------news --------");
            System.out.println("Title : "+items.get(i).select("div.news_tit").text());
            System.out.println("Link : "+items.get(i).select("a").attr("href"));
            System.out.println("description : "+items.get(i).select("div.dsc_wrap .api_txt_lines").text());
            System.out.println("author : "+items.get(i).select("cite").text());
            System.out.println("pub_date : "+items.get(i).select(".sub_txt").text());
            System.out.println("dsc_thumb : "+items.get(i).select(".dsc_thumb img").attr("src"));
        }

        for(int i = 0 ; i < NEWS_CNT ; i++){
            news = new News();
            news.setTitle(items.get(i).select("div.news_tit").text());
            news.setLink(items.get(i).select("a").attr("href"));
            news.setDescription(items.get(i).select("div.dsc_wrap .api_txt_lines").text());
            news.setPubDate(items.get(i).select(".sub_txt").text());
            news.setAuthor(items.get(i).select("cite").text());
            news.setKeyword(keyword);
            news.setPortal("NAVER");
            news.setRankIndex(1);
            news.setThumbnail(items.get(i).select(".dsc_thumb img").attr("src"));
            //news.setCategory(items.get(i).select("category").text());
            news.setRegDate(new Timestamp(System.currentTimeMillis()));
            //System.out.println(news.toString());
            newsRepository.save(news);
        }



/**
 * <item>
 * <title>[러시아 사우디] '체리세프 멀티골' 러시아 5-0 대승…라진스키 개막 축포</title>
 * <link>http://news.tf.co.kr/read/soccer/1725719.htm</link>
 * <description>
 * <![CDATA[
 * 가진스키는 왼쪽에서 알렉산드르 골로빈이 올린 크로스를 타점 높은 헤더로 연결하며 선제골을 낚았다. A매치... 후반 26분 아르템 주바가 골로빈의 패스를 세 번째 골로 이었고, 후반 46분에는 체리세프가 쐐기포를 사우디...
 * ]]>
 * </description>
 * <pubDate>Fri, 15 Jun 2018 02:18:00 +0900</pubDate>
 * <author>더팩트</author>
 * <category>스포츠</category>
 * <media:thumbnail url="http://imgnews.naver.net/image/thumb140/5362/2018/06/15/274155.jpg"/>
 * </item>
 */
    }

    @Test
    public void 검색어조회하기(){
        for(News news :newsRepository.findAll()){
            System.out.println(news);
        }
    }

}
