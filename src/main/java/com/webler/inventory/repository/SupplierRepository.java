package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, String> {

}
