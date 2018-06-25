package com.akami.app.rank.domain.json;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class News4Json {
    private int dummy;
    private int rankIndex;
    private String portal;
    private String type;
    private String  keyword;
    private String  title;
    private String  link;
    private String  description;
    private Timestamp pubDate;
    private String  author;
    private String  category;
    private String  thumbnail;
    private Timestamp regDate;
}

