package com.webler.inventory.model.dtos.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.lang.Integer.MAX_VALUE;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilterParams {
    private String name = "";
    private String category = "";
    private String brand = "";
    private Integer fromPrice = 0;
    private Integer toPrice = MAX_VALUE;
    private Integer fromQuantity = 0;
    private Integer toQuantity = MAX_VALUE;
    private String supplier = "";
    private String manufacturer = "";

}
