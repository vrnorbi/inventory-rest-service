package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.ProductHistoryDto;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.domain.PageRequest.of;

@RestController
@RequestMapping("/producthistory")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductHistoryController {

    @Autowired
    private ProductHistoryRepository productHistoryRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<ProductHistory> getAllProductHistories() {
        return productHistoryRepository.findAll();
    }

    @GetMapping(path="/filter")
    public @ResponseBody Iterable<ProductHistoryDto> getProductHistoriesByProductId(Integer productId) {
        return productHistoryRepository
                .findByProductId(productId, of(0, 7))
                .getContent();
    }
}
