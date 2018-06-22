package com.akami.app.rank.controller;

import com.akami.app.rank.domain.*;
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

        //Word4Json word4Json = new Word4Json(words, )


        for(Word word : words){
            System.out.println(word);
        }
        return words;
    }



}
