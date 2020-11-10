package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.ProductWithHistoryDto;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import com.webler.inventory.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/producthistory")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ProductHistoryController {

    private final ProductService productService;

    private final ProductHistoryRepository productHistoryRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<ProductHistory> getAllProductHistories() {
        return productHistoryRepository.findAll();
    }

    @GetMapping(path="/filter")
    public @ResponseBody ProductWithHistoryDto getProductHistoriesByProductId(Integer productId) {
        return productService.getProductHistoriesByProductId(productId);

    }
}
