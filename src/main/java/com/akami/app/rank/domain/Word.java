package com.akami.app.rank.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;

@Getter
@Setter
@ToString
@Table(name="TB_WORD")
@Entity
public class Word implements Serializable {
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String portal;
    private String type;
    @UpdateTimestamp
    private Timestamp crawlerTime;
    private int rankIndex;
    private String  searchWord;
    private String relationWord;

    public Word(String type, int rankIndex, String searchWord, String relationWord){
        this.type = type;
        this.rankIndex = rankIndex;
        this.searchWord = searchWord;
        this.relationWord = relationWord;
    }

    public Word(){

    }
}
