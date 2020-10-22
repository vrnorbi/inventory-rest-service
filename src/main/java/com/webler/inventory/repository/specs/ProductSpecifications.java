package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.SearchFilter;
import com.webler.inventory.model.entities.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecifications {

    public static Specification<Product> getProductsByFilterSpec(SearchFilter searchFilter) {
        return getProductsByNameSpec(searchFilter.getName())
                .and(getProductsByCategorySpec(searchFilter.getCategory()))
                .and(getProductsByBrandSpec(searchFilter.getBrand()))
                .and(getProductsByManufacturerSpec(searchFilter.getManufacturer()))
                .and(getProductsBySupplierSpec(searchFilter.getSupplier()))
                .and(getProductsPriceGraterThan(searchFilter.getFromPrice()))
                .and(getProductsPriceLessThan(searchFilter.getToPrice()));
    }

    //    one condition
    private static Specification<Product> getProductsByNameSpec(String name) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }

    private static Specification<Product> getProductsByCategorySpec(String category) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("category").get("name"), "%" + category + "%");
    }

    private static Specification<Product> getProductsByBrandSpec(String brand) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("brand").get("name"), "%" + brand + "%");
    }

    private static Specification<Product> getProductsByManufacturerSpec(String manufacturer) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("manufacturer").get("name"), "%" + manufacturer + "%");
    }

    private static Specification<Product> getProductsBySupplierSpec(String supplier) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("supplier").get("name"), "%" + supplier + "%");
    }

    private static Specification<Product> getProductsPriceGraterThan(Integer price) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("price"), price);
    }

    private static Specification<Product> getProductsPriceLessThan(Integer price) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("price"), price);
    }
}