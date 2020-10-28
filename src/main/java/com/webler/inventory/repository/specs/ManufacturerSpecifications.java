package com.webler.inventory.repository.specs;

import com.webler.inventory.model.dtos.ManufacturerFilterParams;
import com.webler.inventory.model.entities.Manufacturer;
import org.springframework.data.jpa.domain.Specification;

public class ManufacturerSpecifications {

    public static Specification<Manufacturer> getManufacturerByFilterSpec(ManufacturerFilterParams manufacturerFilterParams) {
        return getManufacturerByNameSpec(manufacturerFilterParams.getName())
                .and(getManufacturerByCountry(manufacturerFilterParams.getCountry())
                .and(getManufacturerByRating(manufacturerFilterParams.getRating())));
    }

    private static Specification<Manufacturer> getManufacturerByNameSpec(String name) {
        return (Specification<Manufacturer>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("manufacturer").get("name"), "%" + name + "%");
    }

    private static Specification<Manufacturer> getManufacturerByCountry(String country) {
        return (Specification<Manufacturer>) (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("manufacturer").get("country"), "%" + country + "%");
    }

    private static Specification<Manufacturer> getManufacturerByRating(Integer rating) {
        return (Specification<Manufacturer>) (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("rating"), rating);
    }
}