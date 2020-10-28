package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Brand;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BrandRepository extends PagingAndSortingRepository<Brand, Integer>, JpaSpecificationExecutor<Brand> {

}
