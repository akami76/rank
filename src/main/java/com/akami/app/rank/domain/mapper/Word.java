package com.akami.app.rank.domain.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Word {

    @Insert("MERGE INTO WORD(id, portal, type, crawler_time, rank_index, search_word, relation_word)\n" +
            "VALUE(#{id}, #{portal}, #{type}, #{crawlerTime}, #{rankIndex}, #{searchWord}, #{relationWord})")
    void setWord();
}


