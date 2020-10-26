package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Manufacturer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ManufacturerRepository extends PagingAndSortingRepository<Manufacturer, String> {

}
