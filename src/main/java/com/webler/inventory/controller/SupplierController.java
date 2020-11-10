package com.webler.inventory.controller;

import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.dtos.params.SupplierParams;
import com.webler.inventory.model.entities.Supplier;
import com.webler.inventory.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static com.webler.inventory.repository.specs.SupplierSpecifications.getSupplierBySpec;
import static org.springframework.data.domain.PageRequest.of;

@Slf4j
@RestController
@RequestMapping("/suppliers")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")

public class SupplierController {

    private final SupplierRepository supplierRepository;

    @GetMapping(path = "/filter")
    public @ResponseBody Page<Supplier> getSupplierByFilter(SupplierParams supplierParams, SortingParams sortingParams, PagingParams pagingParams) {
        return supplierRepository.findAll(
                getSupplierBySpec(supplierParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting())
        );
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @PostMapping(path = "/new")
    public void saveSupplier(@RequestBody Supplier supplier) {
        supplierRepository.save(supplier);
    }
}
