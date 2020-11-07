package com.webler.inventory.repository;

import com.webler.inventory.model.dtos.ProductDto;
import com.webler.inventory.model.dtos.StatsDto;
import com.webler.inventory.model.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>, JpaSpecificationExecutor<Product> {

    @Query(" select new com.webler.inventory.model.dtos.ProductDto(p.name, p.category.name) " +
            " from Product p " +
            " where p.id = ?1 ")
    ProductDto findProductById(Integer id);

    @Query(" select new com.webler.inventory.model.dtos.StatsDto(p.id, p.name, p.quantity) " +
            " from Product p " +
            " order by p.quantity ")
    List<StatsDto> findProductsWithLowestQuantity(Pageable pageable);

}
