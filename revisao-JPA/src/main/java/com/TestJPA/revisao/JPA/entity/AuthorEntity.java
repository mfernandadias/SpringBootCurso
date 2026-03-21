package com.TestJPA.revisao.JPA.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_author")
public class AuthorEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  name;



   /* public AuthorEntity(Long id, String nationality, String name) {
        this.id = id;
        this.nationality = nationality;
        this.name = name;
    } */


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
