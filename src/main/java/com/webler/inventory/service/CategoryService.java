package com.webler.inventory.service;

import com.webler.inventory.model.dtos.params.CategoryParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Category;
import com.webler.inventory.repository.CategoryRepository;
import com.webler.inventory.repository.specs.CategorySpecifications;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import static org.springframework.data.domain.PageRequest.of;

@Slf4j
@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Page<Category> getCategoryByName(CategoryParams categoryParams, SortingParams sortingParams, PagingParams pagingParams) {
        return categoryRepository.findAll(CategorySpecifications.getCategoryByFilterSpec(categoryParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting()));
    }

    public Iterable<Category> findAllCategories() {
        log.info("Endpoint /categories/all called, retrieving all categories");
        return categoryRepository.findAll();
    }
}
