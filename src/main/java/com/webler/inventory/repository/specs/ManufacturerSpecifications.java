package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.params.ManufacturerFilterParams;
import com.webler.inventory.model.entities.Manufacturer;
import org.springframework.data.jpa.domain.Specification;

public class ManufacturerSpecifications {

    public static Specification<Manufacturer> getManufacturersByFilterSpec(ManufacturerFilterParams manufacturerFilterParams) {
        return getManufacturersByNameSpec(manufacturerFilterParams.getName())
                .and(getManufacturersByCountry(manufacturerFilterParams.getCountry())
                .and(getManufacturersByRating(manufacturerFilterParams.getRating())));
    }

    private static Specification<Manufacturer> getManufacturersByNameSpec(String name) {
        return (Specification<Manufacturer>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }

    private static Specification<Manufacturer> getManufacturersByCountry(String country) {
        return (Specification<Manufacturer>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("country"), "%" + country + "%");
    }

    private static Specification<Manufacturer> getManufacturersByRating(Integer rating) {
        return (Specification<Manufacturer>) (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("rating"), rating);
    }
}
