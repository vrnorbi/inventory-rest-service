package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.params.ManufacturerFilterParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Manufacturer;
import com.webler.inventory.repository.ManufacturerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static com.webler.inventory.repository.specs.ManufacturerSpecifications.getManufacturerByFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@Slf4j
@RestController
@RequestMapping("/manufacturers")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ManufacturerController {

    @Autowired
    private final ManufacturerRepository manufacturerRepository;

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Manufacturer> filterManufacturers(ManufacturerFilterParams manufacturerFilterParams,SortingParams sortingParams, PagingParams pagingParams) {
        return manufacturerRepository.findAll(
                getManufacturerByFilterSpec(manufacturerFilterParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting()));
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }
}
