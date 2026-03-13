package com.TestJPA.revisao.JPA.controller;


import com.TestJPA.revisao.JPA.dto.SaleMinDTO;
import com.TestJPA.revisao.JPA.dto.SaleWithSellerDTO;
import com.TestJPA.revisao.JPA.dto.SalesSumDTO;
import com.TestJPA.revisao.JPA.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<SaleMinDTO> findById(@PathVariable Long id) {
        SaleMinDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/report")
    public ResponseEntity<Page<SaleWithSellerDTO>> getReport(@RequestParam(defaultValue = "")  String minDate, @RequestParam(defaultValue = "") String maxDate, @RequestParam(defaultValue = "" ) String name, Pageable pageable) {
        Page<SaleWithSellerDTO> result = service.searchSales(minDate,maxDate,name,pageable);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/summary")
    public ResponseEntity<List<SalesSumDTO>> getSummary(@RequestParam(defaultValue = "") String minDate, @RequestParam(defaultValue = "") String maxDate) {
        List<SalesSumDTO> result = service.summarySales(minDate,maxDate);
        return ResponseEntity.ok(result);
    }
}
