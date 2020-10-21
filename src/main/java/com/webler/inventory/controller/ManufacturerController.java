package com.webler.inventory.controller;

import com.webler.inventory.model.entities.Manufacturer;
import com.webler.inventory.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Manufacturer> getAllManufacturer() {
        return manufacturerRepository.findAll();
    }
}