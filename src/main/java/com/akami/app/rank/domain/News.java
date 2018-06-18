package com.akami.app.rank.domain;

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
@Table(name="TB_NEWS")
@Entity
public class News implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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
    @CreationTimestamp
    private Timestamp regDate;
}

/**
 * <item>
 * <title>[러시아 사우디] '체리세프 멀티골' 러시아 5-0 대승…라진스키 개막 축포</title>
 * <link>http://news.tf.co.kr/read/soccer/1725719.htm</link>
 * <description>
 * <![CDATA[
 * 가진스키는 왼쪽에서 알렉산드르 골로빈이 올린 크로스를 타점 높은 헤더로 연결하며 선제골을 낚았다. A매치... 후반 26분 아르템 주바가 골로빈의 패스를 세 번째 골로 이었고, 후반 46분에는 체리세프가 쐐기포를 사우디...
 * ]]>
 * </description>
 * <pubDate>Fri, 15 Jun 2018 02:18:00 +0900</pubDate>
 * <author>더팩트</author>
 * <category>스포츠</category>
 * <media:thumbnail url="http://imgnews.naver.net/image/thumb140/5362/2018/06/15/274155.jpg"/>
 * </item>
 */