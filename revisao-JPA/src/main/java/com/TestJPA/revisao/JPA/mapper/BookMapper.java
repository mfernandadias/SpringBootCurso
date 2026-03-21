package com.TestJPA.revisao.JPA.mapper;

import com.TestJPA.revisao.JPA.dto.BookResponseDTO;
import com.TestJPA.revisao.JPA.entity.BookEntity;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class BookMapper {

   public BookResponseDTO toDTO(BookEntity book){
       BookResponseDTO dto = new BookResponseDTO();
       dto.id = book.getId();
       dto.title = book.getTitle();
       dto.category = book.getCategory();
       dto.authorName = book.getAuthor().getName();
       return dto;
   }
}
