package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.params.CategoryParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Category;
import com.webler.inventory.repository.specs.CategorySpecifications;
import com.webler.inventory.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.domain.PageRequest.of;

@Slf4j
@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

        private final CategoryService categoryService;

        @GetMapping(path = "/filter")
        public @ResponseBody Page<Category> getCategoryByName(CategoryParams categoryParams, SortingParams sortingParams, PagingParams pagingParams) {
                return categoryService.getCategoryByName(categoryParams, sortingParams, pagingParams);
        }

        @GetMapping(path="/all")
        public @ResponseBody Iterable<Category> findAllCategories() {
                log.info("Endpoint /categories/all called, retrieving all categories");
                return categoryService.findAllCategories();
        }
}
