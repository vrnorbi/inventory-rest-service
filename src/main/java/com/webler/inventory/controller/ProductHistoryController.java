package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.ProductHistoryDto;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import com.webler.inventory.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/product-history")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ProductHistoryController {

    private final ProductService productService;

    private final ProductHistoryRepository productHistoryRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<ProductHistory> getAllProductHistories() {
        log.info("Endpoint /product-history/filter called, retrieving allhistory");
        return productHistoryRepository.findAll();
    }

    @GetMapping(path="/productId")
    public @ResponseBody List<ProductHistoryDto> getProductHistoriesByProductId(Integer productId) {
        log.info("Endpoint /product-history/filter called, retrieving productidhistory");
        return productService.getProductHistoriesByProductId(productId);
    }
}
