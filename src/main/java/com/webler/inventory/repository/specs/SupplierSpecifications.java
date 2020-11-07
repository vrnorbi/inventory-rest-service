package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.params.SupplierParams;
import com.webler.inventory.model.entities.Supplier;
import org.springframework.data.jpa.domain.Specification;

public class SupplierSpecifications {

    public static Specification<Supplier> getSupplierBySpec(SupplierParams supplierParams) {
        return getSupplierByNameSpec(supplierParams.getName())
                .and(getSupplierByIbanSpec(supplierParams.getIban())
                .and(getSupplierByRatingSpec(supplierParams.getRating())));
    }

    private static Specification<Supplier> getSupplierByNameSpec(String name) {
        return (Specification<Supplier>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }

    private static Specification<Supplier> getSupplierByIbanSpec(String iban) {
        return (Specification<Supplier>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("iban"), "%" + iban + "%");
    }

    private static Specification<Supplier> getSupplierByRatingSpec(Integer rating) {
        return (Specification<Supplier>) (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("rating"),rating);
    }
}
