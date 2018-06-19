package com.akami.app.rank;

import com.akami.app.rank.domain.Image;
import com.akami.app.rank.domain.ImageRepository;
import com.akami.app.rank.domain.Word;
import com.akami.app.rank.service.Rank;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RankTest extends Rank {
    private String rankSearchUrl = "https://www.naver.com/index.html";
    private String realationSearchUrl = "https://search.naver.com/search.naver?query=";
    private final static String NAVER_NEWS_RSS = "http://newssearch.naver.com/search.naver?where=rss&query=";
    private final static int NEWS_CNT = 5;
    private final static String PORTAL = "NAVER";
    private final static String TYPE = "REALTIME";
    private StringBuffer realationWord ;
    private final static String NAVER_IMAGE = "https://m.search.naver.com/search.naver?where=m_image&query=";
    private final static int IMAGE_CNT = 5;


    @Test
    @Override
    public void setRankList() {

        Document rankWords = getDocument(rankSearchUrl, null);

        //System.out.println(rankWords);
        //실시간 검색어 가지고오기
        System.out.println("STEP 0. 실시간 검색어 가지고오기");
        Elements elements = rankWords.select("span.ah_k");
        //System.out.println(elements);
        int rankindex = 1;
        String keyword ;
        String relationWord ;
        Word word ;

        //System.out.println("STEP 1. 실시간 검색어 담기");
        for (Element e : elements) {
            System.out.println(rankindex +" : "+ e.html());

            keyword = e.html();
            rankindex++;
            if(rankindex  == 21) break;
        }
/**
 * <img src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7"
 * class="_img" alt="올림픽" onerror="var we=$Element(this); we.addClass('bg_nimg'); we.attr('alt','이미지준비중'); we.attr('src','data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7');"
 * data-source="https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2F20131030_99%2Fmoounga122_1383134504066zDsgt_JPEG%2F%25C7%25F7%25BE%25D7%25C7%25FC_%25BF%25C3%25B8%25B2%25C7%25C8.jpg&amp;type=b360" data-width="296" data-height="416">
 */
    }

    @Test
    public void 검색어조회하기(){
       // for(Image image :imageRepository.findAll()){
       //     System.out.println(image);
       // }
    }

}
