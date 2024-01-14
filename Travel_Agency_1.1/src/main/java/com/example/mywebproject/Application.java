package com.example.mywebproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.mywebproject")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
