package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.StatsDto;
import com.webler.inventory.model.dtos.params.FilterParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Product;
import com.webler.inventory.repository.ProductRepository;
import com.webler.inventory.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.webler.inventory.repository.specs.ProductSpecifications.getProductsByFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@Slf4j
@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class  ProductController {

    private final ProductService productService;

    private final ProductRepository productRepository;

    @GetMapping(path = "/id")
    public @ResponseBody Product getProductById(Integer id) throws Exception {
        return productRepository.findById(id).orElseThrow(() -> new Exception("Product not found"));
    }

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Product> filterProducts(FilterParams filterParams,
                                                      SortingParams sortingParams,
                                                      PagingParams pagingParams) {
        return productRepository.findAll(
                getProductsByFilterSpec(filterParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting())
        );
    }

    @GetMapping(path = "/low-quantity")
    public @ResponseBody List<StatsDto> getProductsWithLowestQuantity() {
        return productRepository.getProductsWithLowestQuantity(of(0, 5));
    }

    @GetMapping(path = "/low-price")
    public @ResponseBody List<StatsDto> getProductsWithLowestPrice() {
        return productRepository.getProductsWithLowestPrice(of(0, 5));
    }

    @GetMapping(path = "/low-price-in-category")
    public @ResponseBody List<StatsDto> getLowestPricedProductsInAllCategories() {
        return productRepository.getLowestPricedProductsInAllCategories();
    }

    @GetMapping(path = "/biggest-price-drops")
    public @ResponseBody List<StatsDto> getProductsWithBiggestPriceDrop() {
        return productRepository.getProductsWithBiggestPriceDrop();
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
