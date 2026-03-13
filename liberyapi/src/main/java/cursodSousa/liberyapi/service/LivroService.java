package cursodSousa.liberyapi.service;

import cursodSousa.liberyapi.repository.LivroRepository;
import entites.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    //cadastrar
    public Livro salvar(Livro livro){
        return livroRepository.save(livro);
    }

    //listar paginado
    public Page<Livro> listar(Pageable pageable){
        return livroRepository.findAll(pageable);
    }

    //buscar por id

}
