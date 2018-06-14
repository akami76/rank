package com.akami.app.rank;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class RankApplication {

    public static void main(String[] args) {
        SpringApplication.run(RankApplication.class, args);
    }
}
