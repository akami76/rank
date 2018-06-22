package com.akami.app.rank.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

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
    private Image4Json[] image4Json;
    private News4Json[] news4Json;



    public Word4Json(Word word, Image4Json[] image4Json, News4Json[] news4Json){
        this.id = word.getId();
        this.portal = word.getPortal();
        this.type = word.getPortal();
        this.crawlerTime = word.getCrawlerTime();
        this.rankIndex = word.getRankIndex();
        this.searchWord = word.getSearchWord();
        this.relationWord = word.getRelationWord().split(",");
        this.image4Json = image4Json;
        this.news4Json = news4Json;

    }
}
