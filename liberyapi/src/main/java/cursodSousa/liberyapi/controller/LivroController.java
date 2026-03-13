package cursodSousa.liberyapi.controller;

import cursodSousa.liberyapi.service.LivroService;
import entites.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    //cadastrar livro
    @PostMapping
    public Livro salvar(@RequestBody Livro livro){
        return livroService.salvar(livro);
    }

    //buscar por id
    /*@GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable UUID id){
        return livroService.buscarPorId(id);
    }*/
}
