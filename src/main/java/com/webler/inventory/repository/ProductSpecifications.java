package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecifications {

    //    one condition
    public static Specification<Product> getProductsByNameSpec(String name) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }

    public static Specification<Product> getProductsByCategorySpec(String category) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("category").get("name"), "%" + category + "%");
    }

    public static Specification<Product> getProductsByBrandSpec(String brand) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("brand").get("name"), "%" + brand + "%");
    }

    public static Specification<Product> getProductsByManufacturerSpec(String manufacturer) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("manufacturer").get("name"), "%" + manufacturer + "%");
    }

    public static Specification<Product> getProductsBySupplierSpec(String supplier) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("supplier").get("name"), "%" + supplier + "%");
    }

    public static Specification<Product> getProductsPriceGraterThan(Integer price) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("product").get("price"), "%" + price + "%");
    }

    public static Specification<Product> getProductsPriceLessThan(Integer price) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("product").get("price"), "%" + price + "%");
    }
}