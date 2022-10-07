package com.example.day02springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // this annotation will always in base class only, It initialise all the configuration
public class Day02SpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day02SpringProjectApplication.class, args);
        System.out.println("Welcome to Spring Project");
    }

}
