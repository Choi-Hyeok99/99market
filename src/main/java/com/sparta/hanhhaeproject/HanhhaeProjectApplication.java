package com.sparta.hanhhaeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HanhhaeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanhhaeProjectApplication.class, args);
    }

}
