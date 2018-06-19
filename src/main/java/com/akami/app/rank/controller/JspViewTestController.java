package com.akami.app.rank.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@RestController
public class JspViewTestController {
    @RequestMapping(value="/")      // localhost
    public String root() {
        return "info";          // 실제 호출될 /WEB-INF/jsp/info.jsp
    }

    @RequestMapping(value="/test")  // localhost/test
    public String test() {
        return "test/test2";        // 실제 호출될 /WEB-INF/jsp/test/viewtest2.jsp
    }

    @RequestMapping("/rank")
    public String info(){
        return "rank0.9";
    }

}
