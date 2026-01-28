package br.com.erudio.service;


import br.com.erudio.dto.FraseRequest;
import br.com.erudio.dto.FraseResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FraseService {

    //pq criar uma lista de FraseReponse
    private final List<FraseResponse> frases = new ArrayList<FraseResponse>();
    private long proximoId = 1;


    //random ->
    private final Random random = new Random();

    public FraseService(){
        //frases iniciaus (opcinal)
        frases.add(new FraseResponse(proximoId++, "Feito é melhor que perfeito.", "Desconhecido"));
        frases.add(new FraseResponse(proximoId++, "A consistência vence a motivação.", "Desconhecido"));
    }

    public List<FraseResponse> listar(){
        return frases;
    }
    public FraseResponse random(){
        if(frases.isEmpty()) return null;
        int index = random.nextInt(frases.size());
        return frases.get(index);
    }

    //oq esse método criar realiza ?
    public FraseResponse criar(FraseRequest req) {
        // validação simples
        if (req == null) return null;

        String texto = req.getTexto();
        if (texto == null || texto.trim().isEmpty()) {
            return null;
        }

        String autor = req.getAutor();
        if (autor == null || autor.trim().isEmpty()) {
            autor = "Anônimo";
        }

        FraseResponse nova = new FraseResponse(proximoId++, texto.trim(), autor.trim());
        frases.add(nova);
        return nova;
    }


}
