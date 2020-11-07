package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.FilterParams;
import com.webler.inventory.model.dtos.PagingParams;
import com.webler.inventory.model.dtos.SortingParams;
import com.webler.inventory.model.entities.Product;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import com.webler.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.webler.inventory.repository.specs.ProductSpecifications.getProductsByFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class  ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductHistoryRepository productHistoryRepository;

    @GetMapping(path = "/id")
    public @ResponseBody Product getProductById(Integer id) throws Exception {
        return productRepository.findById(id).orElseThrow(() -> new Exception("Product not found"));
    }

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Product> getProductsByFilter(FilterParams filterParams, SortingParams sortingParams, PagingParams pagingParams) {
        return productRepository.findAll(
                getProductsByFilterSpec(filterParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting())
        );
    }

    @DeleteMapping(path = "/delete/{id}")
    @Transactional
    public void deleteProduct(@PathVariable("id") Integer id) {
        productHistoryRepository.deleteByProductId(id);
        productRepository.deleteById(id);
    }

    @PostMapping(path = "/new")
    public void saveProduct(@RequestBody Product product) {
        productRepository.save(product);
        ProductHistory productHistory = new ProductHistory();
        productHistory.setDate(new Date(System.currentTimeMillis()));
        productHistory.setPrice(product.getPrice());
        productHistory.setQuantity(product.getQuantity());
        productHistory.setProduct(product);
        productHistoryRepository.save(productHistory);
    }

    @PutMapping(path = "/update")
    public void updateProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
