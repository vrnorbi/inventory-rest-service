package com.webler.inventory.repository;

import com.webler.inventory.model.entities.ProductHistory;
import org.springframework.data.repository.CrudRepository;

public interface ProductHistoryRepository extends CrudRepository<ProductHistory, Integer> {
    Iterable<ProductHistory> findByPrice(Integer price);
}
