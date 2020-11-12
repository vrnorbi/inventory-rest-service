package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.params.CategoryParams;
import com.webler.inventory.model.entities.Category;
import org.springframework.data.jpa.domain.Specification;

public class CategorySpecifications {

    public static Specification<Category> getCategoriesByFilterSpec(CategoryParams categoryParams) {
        return getCategoriesByNameSpec(categoryParams.getName());
    }

    private static Specification<Category> getCategoriesByNameSpec(String name) {
        return (Specification<Category>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }
}
