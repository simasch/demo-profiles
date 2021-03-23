package com.example.demoprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoProfilesApplication {

    @Value("${key}")
    private String key;

    public static void main(String[] args) {
        SpringApplication.run(DemoProfilesApplication.class, args);
    }

    @Bean
    void foo() {
        System.out.println(key);
    }

}
