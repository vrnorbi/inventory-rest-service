package com.webler.inventory.controller;

import com.webler.inventory.model.entities.Category;
import com.webler.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {

        @Autowired
        private CategoryRepository categoryRepository;

        @GetMapping(path="/all")
        public @ResponseBody Iterable<Category> findByCategoryName() { return categoryRepository.findAll();
        }
}
