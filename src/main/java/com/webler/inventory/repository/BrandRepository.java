package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Brand;
import org.springframework.data.repository.CrudRepository;


public interface BrandRepository extends CrudRepository<Brand, String> {

}
