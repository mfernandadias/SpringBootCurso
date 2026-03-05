package com.TestJPA.revisao.JPA.entitie;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.List;

@Entity
@Table(name = "tb_department")
public class Department {

    @Id
    @GeneratedValue()
    private long id;
    private String name;
    private Double salary;



}
