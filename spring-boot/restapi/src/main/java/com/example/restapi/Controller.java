package com.example.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hellos")
    public String sayHellos() {
        return "Hellos from Spring Boot!";
    }

    @GetMapping("/user")
    public User getUser(){
        return new User(1,"Devdatta","devdatta@outlook.com");
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user){
        return "User: " + user.getName() + "Email: " + user.getMail() + " has created!";
    }
}
