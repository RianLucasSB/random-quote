package com.rian.boas.random_quotes.service;

import com.rian.boas.random_quotes.model.Phrase;
import com.rian.boas.random_quotes.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {
    @Autowired
    PhraseRepository repository;

    public Phrase randomPhrase(){
        return repository.getRandomPhrase();
    }

}
