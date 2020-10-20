package com.webler.inventory.controller;

import com.webler.inventory.model.entities.Brand;
import com.webler.inventory.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandRepository BrandRepository;
    private com.webler.inventory.repository.BrandRepository brandRepository;


    @GetMapping(path="/all")
    public @ResponseBody Iterable<Brand> findBrandName() { return brandRepository.findAll();
    }


}
