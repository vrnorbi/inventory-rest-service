package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.dtos.params.SupplierParams;
import com.webler.inventory.model.entities.Supplier;
import com.webler.inventory.service.SupplierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/suppliers")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SupplierController {

    private final SupplierService supplierService;

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Supplier> getSupplierByFilter(SupplierParams supplierParams, SortingParams sortingParams, PagingParams pagingParams) {
        log.info("Endpoint /suppliers/filter called, retrieving suppliers filter");
        return supplierService.getSupplierByFilter(supplierParams, sortingParams, pagingParams);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Supplier> getAllSuppliers() {
        log.info("Endpoint /suppliers/all called, retrieving all suppliers");
        return supplierService.getAllSuppliers();
    }

    @PostMapping(path = "/new")
    public void saveSupplier(@RequestBody Supplier supplier) {
        log.info("Endpoint /suppliers/new called,saving supplier");
        supplierService.saveSupplier(supplier);
    }
}
