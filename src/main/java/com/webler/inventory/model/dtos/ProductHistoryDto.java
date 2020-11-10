package com.webler.inventory.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductHistoryDto {
    private Date date;
    private Integer price;
    private Integer quantity;
}
