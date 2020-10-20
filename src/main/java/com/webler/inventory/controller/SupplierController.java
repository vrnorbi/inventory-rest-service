package com.webler.inventory.controller;

import com.webler.inventory.model.entities.Supplier;
import com.webler.inventory.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Supplier> findBySupplier() { return supplierRepository.findAll();
    }
}
