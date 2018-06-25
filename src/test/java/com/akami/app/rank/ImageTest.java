package com.akami.app.rank;

import com.akami.app.rank.domain.Image;
import com.akami.app.rank.domain.ImageRepository;
import com.akami.app.rank.domain.News;
import com.akami.app.rank.domain.NewsRepository;
import com.akami.app.rank.service.Rank;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ImageTest extends Rank {
    private final static String NAVER_IMAGE = "https://m.search.naver.com/search.naver?where=m_image&query=";
    private final static int IMAGE_CNT = 5;

    @Autowired
    ImageRepository imageRepository;

    @Test
    @Override
    public void setRankList() {

        String keyword = "월드컵";

        Document newsDoc = getDocument(NAVER_IMAGE, keyword);
        System.out.println("------------newsDoc---------");
       // System.out.println(newsDoc);
        Elements images  = newsDoc.select("div.photo_grid img");
        //System.out.println("---------------------");
        //System.out.println(images);

        Image image;

        for(int i = 0 ; i < IMAGE_CNT ; i++){
            image = new Image();
            image.setKeyword(keyword);
            image.setPortal("NAVER");
            image.setRankIndex(1);
            //image.setTitle();
            image.setUrl(images.get(i).attr("data-source"));
            image.setType("NR");
            System.out.println(images.get(i).attr("data-source"));
            imageRepository.save(image);
        }

/**
 * <img src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7"
 * class="_img" alt="올림픽" onerror="var we=$Element(this); we.addClass('bg_nimg'); we.attr('alt','이미지준비중'); we.attr('src','data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7');"
 * data-source="https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2F20131030_99%2Fmoounga122_1383134504066zDsgt_JPEG%2F%25C7%25F7%25BE%25D7%25C7%25FC_%25BF%25C3%25B8%25B2%25C7%25C8.jpg&amp;type=b360" data-width="296" data-height="416">
 */
    }

    @Test
    public void 검색어조회하기(){
        for(Image image :imageRepository.findAll()){
            System.out.println(image);
        }
    }



}
