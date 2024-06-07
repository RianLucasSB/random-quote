package com.rian.boas.random_quotes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "phrases")
public class Phrase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phrase;
    private String character;
    private String title;
    private String poster;

    public Phrase(Long id, String phrase, String character, String title, String poster) {
        this.id = id;
        this.phrase = phrase;
        this.character = character;
        this.title = title;
        this.poster = poster;
    }

    public Phrase() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
