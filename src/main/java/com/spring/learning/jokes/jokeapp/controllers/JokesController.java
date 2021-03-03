package com.spring.learning.jokes.jokeapp.controllers;

import com.spring.learning.jokes.jokeapp.service.impl.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokesController {
    @Autowired
    JokeServiceImpl jokeService;

    @RequestMapping("/")
    public String getJoke(){
        return jokeService.getJoke();

    }
}
