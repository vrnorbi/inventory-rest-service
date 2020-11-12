package com.webler.inventory.service;

import com.webler.inventory.model.dtos.params.ManufacturerFilterParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Manufacturer;
import com.webler.inventory.repository.ManufacturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import static com.webler.inventory.repository.specs.ManufacturerSpecifications.getManufacturersByFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
public class ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public Page<Manufacturer> filterManufacturers(ManufacturerFilterParams manufacturerFilterParams,
                                                  SortingParams sortingParams,
                                                  PagingParams pagingParams) {
        return manufacturerRepository.findAll(
                getManufacturersByFilterSpec(manufacturerFilterParams),
                of(pagingParams.getPage(),
                    pagingParams.getSize(),
                    sortingParams.getSorting()));
    }

    public  Iterable<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }
}

