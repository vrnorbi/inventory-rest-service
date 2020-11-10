package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.params.BrandParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Brand;
import com.webler.inventory.repository.BrandRepository;
import com.webler.inventory.repository.specs.BrandSpecifications;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.domain.PageRequest.of;

@Slf4j
@RestController
@RequestMapping("/brands")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class BrandController {

    @Autowired
    private final BrandRepository brandRepository;

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Brand> getBrandByNameSpec(BrandParams brandParams, SortingParams sortingParams, PagingParams pagingParams) {
        return brandRepository.findAll(BrandSpecifications.getBrandByFilterSpec(brandParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting()));
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Brand> getAllBrands() {
        log.info("Endpoint /brands/all called, retrieving all brands");
        return brandRepository.findAll();
    }

}
