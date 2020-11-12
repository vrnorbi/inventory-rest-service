package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.params.CategoryParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Category;
import com.webler.inventory.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

        private final CategoryService categoryService;

        @GetMapping(path = "/filter")
        public @ResponseBody Page<Category> filterCategories(CategoryParams categoryParams,
                                                             SortingParams sortingParams,
                                                             PagingParams pagingParams) {
                log.info("Endpoint /categories/filter called, retrieving categories with filter");
                return categoryService.filterCategories(categoryParams, sortingParams, pagingParams);
        }

        @GetMapping(path="/all")
        public @ResponseBody Iterable<Category> getAllCategories() {
                log.info("Endpoint /categories/all called, retrieving all categories");
                return categoryService.getAllCategories();
        }
}
