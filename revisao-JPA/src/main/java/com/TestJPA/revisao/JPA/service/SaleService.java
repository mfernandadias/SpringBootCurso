package com.TestJPA.revisao.JPA.service;


import com.TestJPA.revisao.JPA.dto.SaleMinDTO;
import com.TestJPA.revisao.JPA.dto.SaleWithSellerDTO;
import com.TestJPA.revisao.JPA.dto.SalesSumDTO;
import com.TestJPA.revisao.JPA.dto.iSalesSumary;
import com.TestJPA.revisao.JPA.entitie.Sale;
import com.TestJPA.revisao.JPA.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public SaleMinDTO findById(Long id) {
        Optional<Sale> result = repository.findById(id);
        Sale entity = result.get();
        return new SaleMinDTO(entity);
    }

    public Page<SaleWithSellerDTO> searchSales(String min, String max, String name, Pageable pageable) {
        LocalDate minDate = convertStringToDate(min, "min");
        LocalDate maxDate = convertStringToDate(max, "max");
        if(name == null || name.isEmpty()) {
            return repository.searchSales(minDate, maxDate,pageable);
        }
        return repository.searchSales(minDate, maxDate,name,pageable);
    }

    public List<SalesSumDTO> summarySales(String min, String max) {
        LocalDate minDate = convertStringToDate(min, "min");
        LocalDate maxDate = convertStringToDate(max, "max");
        System.out.println(minDate + " " + maxDate);
        List<iSalesSumary> result = repository.summarySales(minDate, maxDate);
        return result.stream().map(x -> new SalesSumDTO(x)).toList();
    }

    private LocalDate convertStringToDate(String date, String type) {
        // Define the date format pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());


        if (Objects.equals(type, "min")) {
            // If type is "min", return the date one year ago if the input date is null or empty
            return date == null || date.isEmpty() ? today.minusYears(1L) : LocalDate.parse(date, formatter);
        } else {
            // If type is not "min", return the current date if the input date is null or empty
            return date == null || date.isEmpty() ? today : LocalDate.parse(date, formatter);
        }
    }

}
