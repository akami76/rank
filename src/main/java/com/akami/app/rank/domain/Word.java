package com.akami.app.rank.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Word {
    private String type;
    private int rankIndex;
    private String  searchWord;
    ArrayList<String> relationWord;

    public Word(String type, int rankIndex, String searchWord, ArrayList<String> relationWord){
        this.type = type;
        this.rankIndex = rankIndex;
        this.searchWord = searchWord;
        this.relationWord = relationWord;
    }
}
