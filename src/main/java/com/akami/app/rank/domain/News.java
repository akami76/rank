package com.akami.app.rank.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class News {
    private String  type;
    private int rankIndex;
    private String  author;
    private String  thumbnail;
    private String  title;
    private String  description;
    private String  url;
    private String  pubDate;
}
