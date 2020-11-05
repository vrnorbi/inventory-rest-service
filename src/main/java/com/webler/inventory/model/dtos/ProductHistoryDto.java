package com.webler.inventory.model.dtos;

import java.util.Date;

public class ProductHistoryDto {

    private Date date;

    private Integer price;

    private Integer quantity;

    public ProductHistoryDto() {}

    public ProductHistoryDto(Date date, Integer price, Integer quantity) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
