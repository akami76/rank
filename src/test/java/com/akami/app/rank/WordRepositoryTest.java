package com.akami.app.rank;


import com.akami.app.rank.domain.Word;
import com.akami.app.rank.domain.WordRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordRepositoryTest {

    @Autowired
    WordRepository wordRepository;

    @Test
    public void 검색어저장하기(){
        Word word = new Word();
        for(int i = 0 ; i < 20 ; i++) {
            word.setRankIndex(i+1);
            word.setRelationWord(i+1+"위 연관검색어");
            word.setSearchWord(i+1+"위 검색어");
            word.setType("NRW");
            word.setId(0);
            word.setPortal("NAVER");
            word.setCrawlerTime(new Timestamp(System.currentTimeMillis()));
            wordRepository.save(word);
        }

    }

    @Test
    public void 검색어조회하기(){
        for(Word word :wordRepository.findAll()){
            System.out.println(word);
        }
    }
}
