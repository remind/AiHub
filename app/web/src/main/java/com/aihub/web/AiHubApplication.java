package com.aihub.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.aihub"})
public class AiHubApplication {
    public static void main(String[] args) {
        SpringApplication.run(AiHubApplication.class, args);
    }
}
