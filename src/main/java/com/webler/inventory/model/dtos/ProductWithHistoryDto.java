package com.webler.inventory.model.dtos;

import com.webler.inventory.model.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductWithHistoryDto {
    private Product product;
    private List<ProductHistoryDto> productHistories;
}
