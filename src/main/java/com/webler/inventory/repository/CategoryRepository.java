package com.webler.inventory.repository;

import com.webler.inventory.model.entities.Category;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer>, JpaSpecificationExecutor<Category> {}
