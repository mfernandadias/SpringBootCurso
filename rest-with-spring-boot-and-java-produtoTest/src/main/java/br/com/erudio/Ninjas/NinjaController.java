package br.com.erudio.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//qual a utilização da annotacion RetController
@RequestMapping
//qual a utilização da anotação RequestMapping
public class NinjaController {

    @GetMapping("/boasVinda")
    public String boasVindas(){
        return "Essa é minha primeira mensagem";
    }
}
