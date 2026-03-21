package com.TestJPA.revisao.JPA.repository;

import com.TestJPA.revisao.JPA.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {


}
