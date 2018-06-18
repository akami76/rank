package com.akami.app.rank.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Table(name="TB_IMAGE")
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int dummy;
    private int rankIndex;
    private String portal;
    private String type;
    private String  keyword;
    @Column(length = 2000)
    private String url;
    private String title;
    @CreationTimestamp
    private Timestamp regDate;

}
