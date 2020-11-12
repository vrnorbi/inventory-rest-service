package com.webler.inventory.service;

import com.webler.inventory.model.dtos.params.BrandParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Brand;
import com.webler.inventory.repository.BrandRepository;
import com.webler.inventory.repository.specs.BrandSpecifications;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import static org.springframework.data.domain.PageRequest.of;

@Slf4j
@RequiredArgsConstructor
@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public Page<Brand> filterBrands(BrandParams brandParams, SortingParams sortingParams, PagingParams pagingParams) {
        return brandRepository.findAll(BrandSpecifications.getBrandByFilterSpec(brandParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting()));
    }

    public Iterable<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

}
