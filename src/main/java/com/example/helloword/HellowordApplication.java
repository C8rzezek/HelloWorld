package com.example.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HellowordApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HellowordApplication.class, args);
        System.out.println("czexscx");
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HellowordApplication.class);
    }

}
