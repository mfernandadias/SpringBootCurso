package br.com.erudio.controller;


import br.com.erudio.dto.FraseRequest;
import br.com.erudio.dto.FraseResponse;
import br.com.erudio.service.FraseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/frases")
public class FraseController {

    private final FraseService service;


    public FraseController(FraseService service) {
        this.service = service;
    }

    //get - frase
    // GET /frases
    @GetMapping
    public ResponseEntity<List<FraseResponse>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    // GET /frases/random
    @GetMapping("/random")
    public ResponseEntity<FraseResponse> random() {
        FraseResponse frase = service.random();
        if (frase == null) {
            // 204 = sem conteúdo (quando lista está vazia)
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(frase);
    }

    // POST /frases
    @PostMapping
    public ResponseEntity<?> criar(@RequestBody FraseRequest req) {
        FraseResponse criada = service.criar(req);

        if (criada == null) {
            // 400 = requisição inválida
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Campo 'texto' é obrigatório.");
        }

        // 201 = criado
        return ResponseEntity.status(HttpStatus.CREATED).body(criada);
    }
}
