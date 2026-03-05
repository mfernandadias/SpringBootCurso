package com.TestJPA.revisao.JPA.entitie;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_sale")
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    public SaleEntity() {
    }

    public SaleEntity(LocalDate date, Double amount, Integer deals, Integer visited) {
        this.date = date;
        this.amount = amount;
        this.deals = deals;
        this.visited = visited;
    }
    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }
}
