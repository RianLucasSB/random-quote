package com.rian.boas.random_quotes.repository;

import com.rian.boas.random_quotes.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
    @Query("select p from Phrase p order by function('RANDOM') LIMIT 1")
    Phrase getRandomPhrase();
}
