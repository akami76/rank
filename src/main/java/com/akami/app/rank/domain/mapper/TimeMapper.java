package com.akami.app.rank.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.sql.Timestamp;

@Mapper
public interface TimeMapper {
    @Select("SELECT now()")
    Timestamp getTime();
}
