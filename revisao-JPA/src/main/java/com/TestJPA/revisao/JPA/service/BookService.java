package com.TestJPA.revisao.JPA.service;

import com.TestJPA.revisao.JPA.dto.BookRequestDTO;
import com.TestJPA.revisao.JPA.dto.BookResponseDTO;
import com.TestJPA.revisao.JPA.entity.AuthorEntity;
import com.TestJPA.revisao.JPA.entity.BookEntity;
import com.TestJPA.revisao.JPA.mapper.BookMapper;
import com.TestJPA.revisao.JPA.repository.AuthorRepository;
import com.TestJPA.revisao.JPA.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookMapper mapper;

    //public metodo | bookResponseDTO -> tipo de retorno (o que vi voltar pro controller
    //create() -> nome do método
    //bookRequestDTO dto -. dados que vêm da requisição (JSON)
    /*
    📥 EXEMPLO DO QUE CHEGA (Postman)
{
  "title": "Dom Casmurro",
  "category": "Romance",
  "authorId": 1
}
     */
    //create
   public BookResponseDTO create(BookRequestDTO dto){
       //dto.authorID -> é o ID do autor que veio do JSON
       //exemplo: authorId = 1
       //ou seja:
       //busca no banco o autor com ID = 1                           //se o author não existir
       AuthorEntity author = authorRepository.findById(dto.authorId).orElseThrow(()-> new RuntimeException("Autor não encontrado"));
               //se o author não existir

       //cria um objeto vazio do livro
       BookEntity book = new BookEntity();
       book.setTitle(dto.title);
       book.setCategory(dto.category);
       //essse livro pertende a eese autor
       book.setAuthor(author);

       //book -> aponta para -> author

       //salva no banco
       book = bookRepository.save(book);

       //converte dto em responta
       return mapper.toDTO(book);
   }


   public List<BookResponseDTO> findAll(){
       return bookRepository.findAll()
               .stream()
               .map(mapper::toDTO)
               .toList();
   }

   public BookResponseDTO findById(Long id){
       BookEntity book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
       return mapper.toDTO(book);
   }

   public void delete(Long id){
       bookRepository.deleteById(id);
   }
}
