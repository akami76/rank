package com.akami.app.rank.domain.json;

import com.akami.app.rank.domain.Image;
import com.akami.app.rank.domain.News;
import com.akami.app.rank.domain.Word;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Word4Json implements Serializable {
    private int id;
    private String portal;
    private String type;
    private Timestamp crawlerTime;
    private int rankIndex;
    private String  searchWord;
    private String[] relationWord;
    private List<Image> imageList;
    private List<News> newsList;



    public Word4Json(Word word, List<Image> images, List<News> news){
        this.id = word.getId();
        this.portal = word.getPortal();
        this.type = word.getPortal();
        this.crawlerTime = word.getCrawlerTime();
        this.rankIndex = word.getRankIndex();
        this.searchWord = word.getSearchWord();
        this.relationWord = split(word.getRelationWord(),"|");
        //this.relationWord = word.getRelationWord().split("|");
       // System.out.println("relationWord : " + relationWord);
        //this.image4Json = image;
        //this.news4Json = news;

        this.newsList =  new ArrayList<News>();
        this.imageList =  new ArrayList<Image>();
        for(News newsPaper : news){
            if(this.getRankIndex() == newsPaper.getRankIndex()){
                newsList.add(newsPaper);
                System.out.println(this.getRankIndex() + " : OK !~" );
            }
        }
        for(Image image : images){
            if(this.getRankIndex() == image.getRankIndex()){
                imageList.add(image);
                System.out.println(this.getRankIndex() + " : OK !~" );
            }
        }


        //System.out.println(">>>>> "+this.toString());

    }

    public List getRankData(List<News> news, int index){
        List<News> listNews = news;
        listNews.clear();

        for(News newsPaper : news){
            if(index == newsPaper.getRankIndex()){
                listNews.add(newsPaper);
                System.out.println(index + " : OK !~" );
            }

        }
        return listNews;
    }

    public static String[] split(String text , String rex ) {
        if (text == null || text.trim().length() == 0) {
            return null;
        }else{
            text = text.substring(0, text.length()-1);
        }

        List<String> list = new ArrayList<String>();

        while(text.indexOf(rex) > 0) {
            int index = text.indexOf(rex);
            if (index > 0) {
                String word = text.substring(0, index);
                list.add(word);
                text = text.substring(index+1);
            }
        }
        String[] testList = new String[list.size()];
        testList = list.toArray(testList);

        return testList;
    }
}
