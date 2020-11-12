package com.webler.inventory.service;

import com.webler.inventory.model.dtos.params.BrandParams;
import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.entities.Brand;
import com.webler.inventory.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import static com.webler.inventory.repository.specs.BrandSpecifications.getBrandFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public Page<Brand> filterBrands(BrandParams brandParams,
                                    SortingParams sortingParams,
                                    PagingParams pagingParams) {
        return brandRepository.findAll(
                getBrandFilterSpec(brandParams),
                of(pagingParams.getPage(),
                    pagingParams.getSize(),
                    sortingParams.getSorting()));
    }

    public Iterable<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

}
