package com.TestJPA.revisao.JPA.repository;

import com.TestJPA.revisao.JPA.dto.SaleWithSellerDTO;
import com.TestJPA.revisao.JPA.dto.iSalesSumary;
import com.TestJPA.revisao.JPA.entitie.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    //List<SaleSummaryDTO> searchSummary(LocalDate min, LocalDate max);

    @Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max AND UPPER(obj.seller.name) LIKE UPPER(CONCAT('%',:sellerName,'%')) ORDER BY obj.seller.name DESC")
    Page<SaleWithSellerDTO> searchSales(LocalDate min, LocalDate max, String sellerName, Pageable pageable);
    @Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.seller.name DESC")
    Page<SaleWithSellerDTO> searchSales(LocalDate min, LocalDate max, Pageable pageable);

    @Query("SELECT SUM(obj.amount) as amount , obj.seller.name as sellerName FROM Sale obj WHERE obj.date BETWEEN :min AND :max GROUP BY obj.seller.name")
    List<iSalesSumary> summarySales(LocalDate min, LocalDate max);
}
