package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
public interface ProductRepository extends CrudRepository<Product, Integer> {

    Iterable<Product> findByNameContaining(String name);

}