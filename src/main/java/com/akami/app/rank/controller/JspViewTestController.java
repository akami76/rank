package com.akami.app.rank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JspViewTestController {
    @RequestMapping(value="/")      // localhost
    public String root() {
        return "info";          // 실제 호출될 /WEB-INF/jsp/info.jsp
    }

    @RequestMapping(value="/test")  // localhost/test
    public String test() {
        return "test/test2";        // 실제 호출될 /WEB-INF/jsp/test/viewtest2.jsp
    }





}
