package com.webler.inventory.controller;

import com.webler.inventory.model.entities.Product;
import com.webler.inventory.model.dtos.SearchFilter;
import com.webler.inventory.repository.ProductRepository;
import com.webler.inventory.repository.ProductSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/id/{id}")
    public @ResponseBody
    Product getProductById(@PathVariable("id") int id) {
        return productRepository
                .findById(id)
                .orElse(new Product());
    }

    @GetMapping(path = "/name/{name}")
    public @ResponseBody
    Iterable<Product> getProductsByName(@PathVariable("name") String name) {
        return productRepository.findByNameContaining(name);
    }

    @GetMapping(path = "/exactname/{name}/{category}")
    public @ResponseBody
    Iterable<Product> getProductsByExactName(@PathVariable("name") String name, @PathVariable("category") String category, @PathVariable("brand") String brand,@PathVariable("manufacturer") String manufacturer,@PathVariable("supplier") String supplier) {
        return productRepository.findAll(ProductSpecifications.getProductsByNameSpec(name)
                .and(ProductSpecifications.getProductsByCategorySpec(category))
                .and(ProductSpecifications.getProductsByBrandSpec(brand))
                .and(ProductSpecifications.getProductsByManufacturerSpec(manufacturer))
                .and(ProductSpecifications.getProductsBySupplierSpec(supplier)));
    }

    @GetMapping(path = "/filter")
    public @ResponseBody Iterable<Product> getProductsByFilter(SearchFilter searchFilter) {
        return productRepository.findAll(ProductSpecifications.getProductsByNameSpec(searchFilter.getName())
                .and(ProductSpecifications.getProductsByCategorySpec(searchFilter.getCategory()))
                .and(ProductSpecifications.getProductsByBrandSpec(searchFilter.getBrand()))
                .and(ProductSpecifications.getProductsByManufacturerSpec(searchFilter.getManufacturer()))
                .and(ProductSpecifications.getProductsBySupplierSpec(searchFilter.getSupplier())));
    }
}
