package mfernandas.TodoList.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

public class SaudacaoController {

    // Exemplo de chamada: http://localhost:8080/saudacao?nome=Maria
    @GetMapping("/saudacao")
    public String saudacao(@RequestParam String name){
        LocalDateTime agora = LocalDateTime.now();
        int hora = agora.getHour();
        String mensagem;

        if(hora >= 5 && hora < 12){
            mensagem = "Bom dia";
        }else if(hora >= 12 && hora < 18){
            mensagem = "Boa Tarde";
        }else {
            mensagem = "Boa noite";
        }

        return mensagem + ", " + name + "! Seja Bem-Vindo";
    }

}
