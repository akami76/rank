package com.akami.app.rank.domain.json;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class Image4Json {
    private int dummy;
    private int rankIndex;
    private String portal;
    private String type;
    private String  keyword;
    private String url;
    private String title;
    private Timestamp regDate;

}
