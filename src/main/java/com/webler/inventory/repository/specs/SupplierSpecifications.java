package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.params.SupplierParams;
import com.webler.inventory.model.entities.Supplier;
import org.springframework.data.jpa.domain.Specification;

public class SupplierSpecifications {

    public static Specification<Supplier> getSuppliersByFilterSpec(SupplierParams supplierParams) {
        return getSuppliersByNameSpec(supplierParams.getName())
                .and(getSuppliersByIbanSpec(supplierParams.getIban())
                .and(getSuppliersByRatingSpec(supplierParams.getRating())));
    }

    private static Specification<Supplier> getSuppliersByNameSpec(String name) {
        return (Specification<Supplier>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }

    private static Specification<Supplier> getSuppliersByIbanSpec(String iban) {
        return (Specification<Supplier>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("iban"), "%" + iban + "%");
    }

    private static Specification<Supplier> getSuppliersByRatingSpec(Integer rating) {
        return (Specification<Supplier>) (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("rating"),rating);
    }
}
