package com.webler.inventory.service;

import com.webler.inventory.model.dtos.params.ManufacturerFilterParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Manufacturer;
import com.webler.inventory.repository.ManufacturerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import static com.webler.inventory.repository.specs.ManufacturerSpecifications.getManufacturerByFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@Slf4j
@RequiredArgsConstructor
@Service
public class ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public Page<Manufacturer> filterManufacturers(ManufacturerFilterParams manufacturerFilterParams, SortingParams sortingParams, PagingParams pagingParams) {
        return manufacturerRepository.findAll(getManufacturerByFilterSpec(manufacturerFilterParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting()));
    }

    public  Iterable<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }
}

