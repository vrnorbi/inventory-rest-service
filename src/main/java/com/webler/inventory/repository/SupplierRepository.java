package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Supplier;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SupplierRepository extends PagingAndSortingRepository<Supplier, Integer>, JpaSpecificationExecutor<Supplier> {}
