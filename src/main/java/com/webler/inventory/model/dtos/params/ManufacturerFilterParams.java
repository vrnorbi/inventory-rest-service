package com.webler.inventory.model.dtos.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerFilterParams {
    private String name = "";
    private String country = "";
    private String url = "";
    private Integer rating = 0;
}
