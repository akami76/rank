package com.akami.app.rank.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepository extends CrudRepository<News, Integer> {

    @Query(value="SELECT max(dummy) max_dumy FROM TB_NEWS", nativeQuery = true)
    public List<Object[]> findByMaxSeqQuery(String empNm);

    public void delete

}
