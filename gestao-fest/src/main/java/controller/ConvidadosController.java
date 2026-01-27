package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
classe Controlador, então o nome compelto nos faz pensar que essa classe "é o controlador de convidados"

 */
@Controller
public class ConvidadosController {
    /*
    agora, podemos criar o método que receberá a requisiçãoo e retornará o nome na view
     */

    @GetMapping("/convidados")
    public String listar(){
        return "Listaconvidados";
    }




}
