package com.webler.inventory.service;

import com.webler.inventory.model.entities.Product;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import com.webler.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductHistoryRepository productHistoryRepository;


    @Transactional
    public void deleteProduct(Integer id) {
        productHistoryRepository.deleteByProductId(id);
        productRepository.deleteById(id);
    }

    @Transactional
    public void saveProduct(Product product) {
        productRepository.save(product);
        ProductHistory productHistory = new ProductHistory();
        productHistory.setDate(new Date(System.currentTimeMillis()));
        productHistory.setPrice(product.getPrice());
        productHistory.setQuantity(product.getQuantity());
        productHistory.setProduct(product);
        productHistoryRepository.save(productHistory);
    }

}
