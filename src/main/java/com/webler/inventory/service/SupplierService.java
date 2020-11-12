package com.webler.inventory.service;

import com.webler.inventory.model.dtos.params.PagingParams;
import com.webler.inventory.model.dtos.params.SortingParams;
import com.webler.inventory.model.dtos.params.SupplierParams;
import com.webler.inventory.model.entities.Supplier;
import com.webler.inventory.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import static com.webler.inventory.repository.specs.SupplierSpecifications.getSuppliersByFilterSpec;
import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    public Page<Supplier> filterSuppliers(SupplierParams supplierParams,
                                          SortingParams sortingParams,
                                          PagingParams pagingParams) {
        return supplierRepository.findAll(
                getSuppliersByFilterSpec(supplierParams),
                of(pagingParams.getPage(), pagingParams.getSize(), sortingParams.getSorting())
        );
    }

    public Iterable<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

}
