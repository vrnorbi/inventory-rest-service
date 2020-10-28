package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.PagingParams;
import com.webler.inventory.model.dtos.SortingParams;
import com.webler.inventory.model.dtos.SupplierParams;
import com.webler.inventory.model.entities.Supplier;
import com.webler.inventory.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static com.webler.inventory.repository.specs.SupplierSpecifications.getSupplierBySpec;
import static org.springframework.data.domain.PageRequest.of;

@RestController
@RequestMapping("/suppliers")
@CrossOrigin(origins = "http://localhost:4200")

public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Supplier> getSupplierByFilter(SupplierParams supplierParams, SortingParams sortingParams, PagingParams pagingParams) {
        return supplierRepository.findAll(
                getSupplierBySpec(supplierParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting())
        );
    }

    @PostMapping(path = "/new")
    public void saveSupplier(@RequestBody Supplier supplier) {
        supplierRepository.save(supplier);
    }
}
