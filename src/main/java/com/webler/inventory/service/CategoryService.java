package com.webler.inventory.service;

import com.webler.inventory.model.dtos.params.CategoryParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Category;
import com.webler.inventory.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import static com.webler.inventory.repository.specs.CategorySpecifications.getCategoriesByFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Page<Category> filterCategories(CategoryParams categoryParams,
                                           SortingParams sortingParams,
                                           PagingParams pagingParams) {
        return categoryRepository.findAll(
                getCategoriesByFilterSpec(categoryParams),
                of(pagingParams.getPage(),
                    pagingParams.getSize(),
                    sortingParams.getSorting()));
    }

    public Iterable<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
