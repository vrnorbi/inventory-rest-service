package com.webler.inventory.model.dtos;

import java.util.List;

public class ProductWithHistoryDto {

    private ProductDto product;

    private List<ProductHistoryDto> productHistories;

    public ProductWithHistoryDto() {}

    public ProductWithHistoryDto(ProductDto product, List<ProductHistoryDto> productHistories) {
        this.product = product;
        this.productHistories = productHistories;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public List<ProductHistoryDto> getProductHistories() {
        return productHistories;
    }

    public void setProductHistories(List<ProductHistoryDto> productHistories) {
        this.productHistories = productHistories;
    }

}
