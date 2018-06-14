package com.akami.app.rank.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Image {
    private String url;
    private String keyword;
    private String title;
    private int rankIndex;
    private String type;

}
