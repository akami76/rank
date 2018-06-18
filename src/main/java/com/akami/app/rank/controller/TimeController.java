package com.akami.app.rank.controller;

import com.akami.app.rank.domain.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class TimeController {

    @Autowired
    TimeMapper timeMapper;


    @RequestMapping("time")
    public Timestamp getTime(){
        return timeMapper.getTime();
    }

    @RequestMapping("/info")
    public String info(){
        return "info";
    }

}
