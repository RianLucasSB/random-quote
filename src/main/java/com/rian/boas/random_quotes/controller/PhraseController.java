package com.rian.boas.random_quotes.controller;

import com.rian.boas.random_quotes.dto.PhraseDTO;
import com.rian.boas.random_quotes.model.Phrase;
import com.rian.boas.random_quotes.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frase")
public class PhraseController {

    @Autowired
    PhraseService service;

    @GetMapping()
    PhraseDTO getRandomPhrase(){
        Phrase phrase = service.randomPhrase();
        return new PhraseDTO(phrase.getTitle(), phrase.getPhrase(), phrase.getCharacter(), phrase.getPoster());
    }
}
