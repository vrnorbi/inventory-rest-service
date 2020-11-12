package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.params.BrandParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Brand;
import com.webler.inventory.service.BrandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/brands")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class BrandController {

    private final BrandService brandService;

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Brand> filterBrands(BrandParams brandParams,
                                                  SortingParams sortingParams,
                                                  PagingParams pagingParams) {
        log.info("Endpoint /brands/filter called, retrieving brands");
        return brandService.filterBrands(brandParams, sortingParams, pagingParams);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Brand> getAllBrands() {
        log.info("Endpoint /brands/all called, retrieving all brands");
        return brandService.getAllBrands();
    }

}
