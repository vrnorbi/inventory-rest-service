package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.FilterParams;
import com.webler.inventory.model.entities.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecifications {

    public static Specification<Product> getProductsByFilterSpec(FilterParams filterParams) {
        return getProductsByNameSpec(filterParams.getName())
                .and(getProductsByCategorySpec(filterParams.getCategory()))
                .and(getProductsByBrandSpec(filterParams.getBrand()))
                .and(getProductsByManufacturerSpec(filterParams.getManufacturer()))
                .and(getProductsBySupplierSpec(filterParams.getSupplier()))
                .and(getProductsPriceGraterThan(filterParams.getFromPrice()))
                .and(getProductsPriceLessThan(filterParams.getToPrice())
                .and(getProductsQuantityGraterThan(filterParams.getFromQuantity()))
                .and(getProductsQuantityLessThan(filterParams.getToQuantity())));
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

    private static Specification<Product> getProductsQuantityGraterThan(Integer quantity) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("quantity"), quantity);
    }

    private static Specification<Product> getProductsQuantityLessThan(Integer quantity) {
        return (Specification<Product>) (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("quantity"), quantity);
    }
}