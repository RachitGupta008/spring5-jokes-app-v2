package com.spring.learning.jokes.jokeapp.service.impl;


import com.spring.learning.jokes.jokeapp.service.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public String getJoke(){
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();

    }

}
