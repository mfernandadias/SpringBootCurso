package mfernandas.cursodesousa.arquiteturaspring.todos;

import lombok.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {
    @Value("${app.config.variavel}")
    private String variavel;

    public void imprimirVarivel(){
        System.out.println(variavel);
    }
}
