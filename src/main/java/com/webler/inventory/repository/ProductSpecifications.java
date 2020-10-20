package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecifications {

    public static Specification<Product> getProductsByNameSpec(String name) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("name"), name);
    }

}
