package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.params.BrandParams;
import com.webler.inventory.model.entities.Brand;
import org.springframework.data.jpa.domain.Specification;

public class BrandSpecifications {

    public static Specification<Brand> getBrandsByFilterSpec(BrandParams brandParams) {
        return getBrandsByNameSpec(brandParams.getName());
    }

    private static Specification<Brand> getBrandsByNameSpec(String name) {
        return (Specification<Brand>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }
}
