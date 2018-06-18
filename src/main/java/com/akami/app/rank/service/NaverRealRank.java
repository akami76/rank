package com.akami.app.rank.service;

import com.akami.app.rank.domain.Word;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class NaverRealRank extends Rank{

    private String rankSearchUrl = "https://www.naver.com/index.html";
    private String realationSearchUrl = "https://search.naver.com/search.naver?query=";
    private final static String TYPE = "N0R0";
    private ArrayList<String> realationWord ;



    @Override
    public void setRankList() {
        Document rankWords = getDocument(rankSearchUrl, null);

        //System.out.println(rankWords);
        Elements elements = rankWords.select("span.ah_k");
        //System.out.println(elements);
        int rankindex = 1;
        String keyword ;
        String relationWord ;
        for (Element e : elements) {
            //System.out.println(rankindex +" : "+ e.html());
            //실시간 검색어 담기
            keyword = e.html();
                //연관검색어 주어담기
                realationWord = new ArrayList<String>();
                rankWords = getDocument(realationSearchUrl, keyword);
                Elements reEl = rankWords.select("ul._related_keyword_ul > li");

                for (Element re : reEl) {
                   // System.out.println(rankindex +" : "+ Jsoup.clean( re.html(), Whitelist.none()));
                    relationWord = Jsoup.clean( re.html(), Whitelist.none());
                    realationWord.add(relationWord);
                }

                rankList.add(new Word(TYPE, rankindex, keyword, realationWord.toString()));





            rankindex++;
            if(rankindex  == 21) break;
        }

    }






    public static void main(String args[]){
        NaverRealRank naverRealRank = new NaverRealRank();

         naverRealRank.setRankList();

        ArrayList<Word> list = naverRealRank.rankList;

        for(Word word : list)
        System.out.println(word);
    }
}
