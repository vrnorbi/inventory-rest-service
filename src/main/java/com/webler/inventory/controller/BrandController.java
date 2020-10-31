package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.BrandParams;
import com.webler.inventory.model.dtos.PagingParams;
import com.webler.inventory.model.dtos.SortingParams;
import com.webler.inventory.model.entities.Brand;
import com.webler.inventory.repository.BrandRepository;
import com.webler.inventory.repository.specs.BrandSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.domain.PageRequest.of;

@RestController
@RequestMapping("/brands")
@CrossOrigin(origins = "http://localhost:4200")
public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    public @ResponseBody Page<Brand> getBrandByNameSpec(BrandParams brandParams, SortingParams sortingParams, PagingParams pagingParams) {
        return brandRepository.findAll(BrandSpecifications.getBrandByFilterSpec(brandParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting()));
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

}
