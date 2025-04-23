package io.github.cursodsousa.produtosapi.controller;


import io.github.cursodsousa.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //controlar rest
@RequestMapping("produtos") //qual a sua utilidade de requestMapping ?
public class ProdutoController {

    @PostMapping
    public void salvar(@RequestBody Produto produto){ //qual a utilidade da "RequestBody
        System.out.println("Produto recebido: " + produto);
    }
}
