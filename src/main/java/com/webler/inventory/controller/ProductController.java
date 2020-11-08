package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.StatsDto;
import com.webler.inventory.model.dtos.params.FilterParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Product;
import com.webler.inventory.repository.ProductRepository;
import com.webler.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.webler.inventory.repository.specs.ProductSpecifications.getProductsByFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class  ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

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

    @GetMapping(path = "/low-quantity")
    public @ResponseBody List<StatsDto> findProductsWithLowestQuantity() {
        return productRepository.findProductsWithLowestQuantity(of(0, 5));
    }

    @GetMapping(path = "/low-price")
    public @ResponseBody List<StatsDto> findProductsWithLowestPrice() {
        return productRepository.findProductsWithLowestPrice(of(0, 5));
    }

    @GetMapping(path = "/low-price-in-category")
    public @ResponseBody List<StatsDto> findLowestPriceInCategory() {
        return productRepository.findLowestPriceInCategory();
    }


    @DeleteMapping(path = "/delete/{id}")
    public void deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
    }

    @PostMapping(path = "/new")
    public void saveProduct(@RequestBody Product product) {
       productService.saveProduct(product);
    }

}
