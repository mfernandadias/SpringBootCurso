package com.APIFrasesMotivacionais.demo.service;

import com.APIFrasesMotivacionais.demo.model.Phrase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PhraseService {
    private List<Phrase> phrases = new ArrayList<>();
    private Long nextId = 1L;

    //
    public List<Phrase> getAll(){
        return phrases;
    }

    public Phrase getById(Long id) {
        return phrases.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public Phrase create(Phrase phrase) {
        phrase.setId(nextId++);
        phrases.add(phrase);
        return phrase;
    }

    public Phrase update(Long id, Phrase updatedPhrase) {
        Phrase existing = getById(id);
        if (existing != null) {
            existing.setContent(updatedPhrase.getContent());
            return existing;
        }
        return null;
    }

    public boolean delete(Long id) {
        return phrases.removeIf(p -> p.getId().equals(id));
    }

    public Phrase getRandomPhrase() {
        if (phrases.isEmpty()) return null;
        Random rand = new Random();
        return phrases.get(rand.nextInt(phrases.size()));
    }

}
