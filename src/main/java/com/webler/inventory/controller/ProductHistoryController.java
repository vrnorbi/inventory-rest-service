package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.ProductDto;
import com.webler.inventory.model.dtos.ProductHistoryDto;
import com.webler.inventory.model.dtos.ProductWithHistoryDto;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import com.webler.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.domain.PageRequest.of;

@RestController
@RequestMapping("/producthistory")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductHistoryController {

    @Autowired
    private ProductHistoryRepository productHistoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<ProductHistory> getAllProductHistories() {
        return productHistoryRepository.findAll();
    }

    @GetMapping(path="/filter")
    public @ResponseBody ProductWithHistoryDto getProductHistoriesByProductId(Integer productId) {
        List<ProductHistoryDto> productHistoryDtos = productHistoryRepository
                                                        .findByProductId(productId, of(0, 7))
                                                        .getContent();
        ProductDto productDto = productRepository.findProductById(productId);
        return new ProductWithHistoryDto(productDto, productHistoryDtos);

    }
}
