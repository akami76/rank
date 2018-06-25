package com.akami.app.rank.controller;

import com.akami.app.rank.domain.*;
import com.akami.app.rank.domain.json.Image4Json;
import com.akami.app.rank.domain.json.Word4Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RankController {

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    WordRepository wordRepository;

    @Autowired
    NewsRepository newsRepository;


    @RequestMapping("/rank")
    public String rank(){
        List list = (List) wordRepository.findAll();


        for(Object o : list){
            System.out.println(o.toString());
        }
        return "rank";
    }


    @RequestMapping("/rankJson")
    @ResponseBody
    public List rankJson(){
        List<Word> words = (List<Word>) wordRepository.findAll();

        //System.out.println("수집결과 : " + words.size());

        //Word4Json word4Json = new Word4Json(words, )

        ArrayList<Word4Json> word4JsonsList = new ArrayList<Word4Json>();

        //전체 이미지 목록담기
        List<Image> imageList =  (List<Image>)imageRepository.findAll();
        //
        List<News> newsList =  (List<News>)newsRepository.findAll();


        for(Word word : words){
           // System.out.println(word);
            word4JsonsList.add(new Word4Json(word,imageList, newsList));
        }
        return word4JsonsList;
    }

    /*public List getRankData(List<Image> images, int index){
        List<Image> listImages = images;
        listImages.clear();

        for(Image image : images){
            if(index == image.getRankIndex()){
                listImages.add(image);
            }

        }
        return listImages;
    }*/
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



}
