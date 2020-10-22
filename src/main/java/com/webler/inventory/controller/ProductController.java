package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.SearchFilter;
import com.webler.inventory.model.entities.Product;
import com.webler.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.webler.inventory.repository.specs.ProductSpecifications.getProductsByFilterSpec;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/filter")
    public @ResponseBody Iterable<Product> getProductsByFilter(SearchFilter searchFilter) {
        return productRepository.findAll(getProductsByFilterSpec(searchFilter));
    }

    @PostMapping(path="/new")
    public @ResponseBody void saveProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

}
