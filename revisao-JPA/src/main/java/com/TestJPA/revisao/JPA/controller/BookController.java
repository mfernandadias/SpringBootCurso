package com.TestJPA.revisao.JPA.controller;

import com.TestJPA.revisao.JPA.dto.BookRequestDTO;
import com.TestJPA.revisao.JPA.dto.BookResponseDTO;
import com.TestJPA.revisao.JPA.repository.BookRepository;
import com.TestJPA.revisao.JPA.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public BookResponseDTO create(@RequestBody BookRequestDTO dto){
        return service.create(dto);
    }

    public List<BookResponseDTO> findAll(){
        return service.findAll();
    }

    @GetMapping("?{id}")
    public BookResponseDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }





}
