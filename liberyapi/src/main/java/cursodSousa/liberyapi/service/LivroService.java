package cursodSousa.liberyapi.service;

import cursodSousa.liberyapi.repository.LivroRepository;
import entites.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    //cadastrar
    public Book salvar(Book livro){
        return livroRepository.save(livro);
    }

    //listar paginado
    public Page<Book> listar(Pageable pageable){
        return livroRepository.findAll(pageable);
    }

    //buscar por id

}
