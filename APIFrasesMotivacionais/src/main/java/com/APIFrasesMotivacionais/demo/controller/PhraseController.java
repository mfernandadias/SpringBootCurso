package com.APIFrasesMotivacionais.demo.controller;

import com.APIFrasesMotivacionais.demo.model.Phrase;
import com.APIFrasesMotivacionais.demo.service.PhraseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phrases")
public class PhraseController {
    private final PhraseService service;
    /*
    controlador REST responde às requisições HTTP
    feitas pelo navegador ou sistemas
     */
    //endpoints: GET, POST, PUT, DELETE, GET aleatória
    public PhraseController(PhraseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Phrase> getAll() {
        return service.getAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Phrase> getById(@PathVariable Long id) {
        Phrase phrase = service.getById(id);
        return phrase != null ? ResponseEntity.ok(phrase) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Phrase create(@RequestBody Phrase phrase) {
        return service.create(phrase);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Phrase> update(@PathVariable Long id, @RequestBody Phrase phrase) {
        Phrase updated = service.update(id, phrase);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return service.delete(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    @GetMapping("/random")
    public ResponseEntity<Phrase> getRandom() {
        Phrase phrase = service.getRandomPhrase();
        return phrase != null ? ResponseEntity.ok(phrase) : ResponseEntity.noContent().build();
    }


}
