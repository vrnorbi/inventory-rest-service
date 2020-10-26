package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.FilterParams;
import com.webler.inventory.model.dtos.PagingParams;
import com.webler.inventory.model.dtos.SortingParams;
import com.webler.inventory.model.entities.Manufacturer;
import com.webler.inventory.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.domain.PageRequest.of;

@RestController
@RequestMapping("/manufacturers")
@CrossOrigin(origins = "http://localhost:4200")
public class ManufacturerController {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Manufacturer> filterManufacturers(FilterParams filterParams,SortingParams sortingParams, PagingParams pagingParams) {
        return manufacturerRepository.findAll(of(pagingParams.getPage(), pagingParams.getSize()));
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Manufacturer> getAllManufacturer() {
        return manufacturerRepository.findAll();
    }
}