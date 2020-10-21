package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Brand;
import com.webler.inventory.model.entities.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
public interface ProductRepository extends CrudRepository<Product, Integer>, JpaSpecificationExecutor<Product> {

    Iterable<Product> findByNameContaining(String name);

}