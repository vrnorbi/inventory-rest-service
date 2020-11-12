package com.webler.inventory.service;

import com.webler.inventory.model.dtos.ProductHistoryDto;
import com.webler.inventory.model.entities.Product;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import com.webler.inventory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductHistoryRepository productHistoryRepository;


    public List<ProductHistoryDto> getProductHistoriesByProductId(Integer productId) {
        return productHistoryRepository
                .findByProductId(productId, of(0, 7))
                .getContent()
                .stream()
                .sorted(comparing(ProductHistoryDto::getDate))
                .collect(toList());
    }

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
