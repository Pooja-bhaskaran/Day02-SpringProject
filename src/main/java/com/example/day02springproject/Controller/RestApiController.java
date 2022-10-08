package com.example.day02springproject.Controller;

import com.example.day02springproject.Entity.UserData;
import org.springframework.web.bind.annotation.*;

@RestController // which control all the api's
public class RestApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Bridgelabz";
    }

    @GetMapping("/query")
    public String helloQuery(@RequestParam(value = "name") String name){
        return "Hello " + name + " !";
    }

    @RequestMapping(value = {"/anotherQuery"}, method = RequestMethod.GET)
    public String newQuery(@RequestParam (value = "newName") String newName){
        return "Hello " + newName + " !";
    }

    @GetMapping("/path/{name}")
    public String pathVar(@PathVariable String name ){
        return "Hello " + name + " from Bridgelabz !!";
    }

    @PostMapping("/post")
    public String fullName(@RequestBody UserData userData){
        return "Hello " + userData.getFirstName() + " " + userData.getLastName() + " from Bridgelabz !!";
    }

}

