package com.example.day02springproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // which control all the api's
public class RestApiController {
        @GetMapping("/hello")
        public String hello() {
            return "Hello from Bridgelabz";
        }

}

