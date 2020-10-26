package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Manufacturer;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ManufacturerRepository extends PagingAndSortingRepository<Manufacturer, String>, JpaSpecificationExecutor<Manufacturer> {

    Iterable<Manufacturer> findByNameContaining(String name);
}
