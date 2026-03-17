package cursodSousa.liberyapi.controller;

import cursodSousa.liberyapi.service.LivroService;
import entites.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    //cadastrar livro
    @PostMapping
    public Book salvar(@RequestBody Book livro){
        return livroService.salvar(livro);
    }

    //buscar por id
    /*@GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable UUID id){
        return livroService.buscarPorId(id);
    }*/
}
