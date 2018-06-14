package com.akami.app.rank.service;

import com.akami.app.rank.domain.Word;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;

abstract class Rank {
    //검색어 리스트
    public ArrayList<Word> rankList = new ArrayList<Word>();

    //검색어를 가져올 곳에서 수집
    public Document getDocument(String rankSearchUrl){
        Document doc = null;
        try {
            doc = Jsoup.connect(rankSearchUrl).get();
        } catch (IOException e) {
            System.out.println("접속오류 : "+ rankSearchUrl);
            e.printStackTrace();
        }
        return doc;
    }

    public abstract void setRankSearchUrl(String rankSearchUrl);

    public abstract void setRankList();

}
