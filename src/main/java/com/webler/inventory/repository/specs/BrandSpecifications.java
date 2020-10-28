package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.BrandParams;
import com.webler.inventory.model.entities.Brand;
import org.springframework.data.jpa.domain.Specification;

public class BrandSpecifications {

    public static Specification<Brand> getBrandByFilterSpec(BrandParams brandParams) {
        return getBrandByNameSpec(brandParams.getName());
    }

    private static Specification<Brand> getBrandByNameSpec(String name) {
        return (Specification<Brand>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }
}
