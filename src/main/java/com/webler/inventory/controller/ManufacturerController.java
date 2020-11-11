package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.params.ManufacturerFilterParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Manufacturer;
import com.webler.inventory.service.ManufacturerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/manufacturers")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Manufacturer> filterManufacturers(ManufacturerFilterParams manufacturerFilterParams,SortingParams sortingParams, PagingParams pagingParams) {
        log.info("Endpoint /manufacturers/filter called, retrieving manufacturers");
        return manufacturerService.filterManufacturers(manufacturerFilterParams, sortingParams, pagingParams);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Manufacturer> getAllManufacturers() {
        log.info("Endpoint /manufacturers/filter called, retrieving manufacturer");
        return manufacturerService.getAllManufacturers();
    }
}
