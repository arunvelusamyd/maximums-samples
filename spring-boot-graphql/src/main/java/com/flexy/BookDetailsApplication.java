package com.flexy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookDetailsApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BookDetailsApplication.class);
        app.run(args);
    }

}
