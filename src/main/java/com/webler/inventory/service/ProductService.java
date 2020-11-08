package com.webler.inventory.service;

import com.webler.inventory.model.dtos.ProductDto;
import com.webler.inventory.model.dtos.ProductHistoryDto;
import com.webler.inventory.model.dtos.ProductWithHistoryDto;
import com.webler.inventory.model.entities.Product;
import com.webler.inventory.model.entities.ProductHistory;
import com.webler.inventory.repository.ProductHistoryRepository;
import com.webler.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static org.springframework.data.domain.PageRequest.of;

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

    public ProductWithHistoryDto getProductHistoriesByProductId(Integer productId) {
        List<ProductHistoryDto> productHistoryDtos = productHistoryRepository
                .findByProductId(productId, of(0, 7))
                .getContent()
                .stream()
                .sorted(comparing(ProductHistoryDto::getDate))
                .collect(toList());
        ProductDto productDto = productRepository.findProductById(productId);
        return new ProductWithHistoryDto(productDto, productHistoryDtos);
    }

}
