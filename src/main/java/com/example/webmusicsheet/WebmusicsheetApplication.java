package com.example.webmusicsheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WebmusicsheetApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebmusicsheetApplication.class, args);
    }

}
