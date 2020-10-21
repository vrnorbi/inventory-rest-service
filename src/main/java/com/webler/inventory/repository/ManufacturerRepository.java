package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, String> {

}
