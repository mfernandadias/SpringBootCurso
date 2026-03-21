package com.TestJPA.revisao.JPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_book")
public class BookEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String category;

    //muitos books tem o mesmo autor
    @ManyToOne
    @JoinColumn(name = "author_id" )
    private AuthorEntity author;

    public BookEntity(Long id, AuthorEntity author, String category, String title) {
        this.id = id;
        this.author = author;
        this.category = category;
        this.title = title;
    }

    public BookEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
