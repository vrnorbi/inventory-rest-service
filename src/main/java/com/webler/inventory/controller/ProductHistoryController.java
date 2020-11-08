package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.ProductWithHistoryDto;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import com.webler.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producthistory")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductHistoryController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductHistoryRepository productHistoryRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<ProductHistory> getAllProductHistories() {
        return productHistoryRepository.findAll();
    }

    @GetMapping(path="/filter")
    public @ResponseBody ProductWithHistoryDto getProductHistoriesByProductId(Integer productId) {
        return productService.getProductHistoriesByProductId(productId);

    }
}
