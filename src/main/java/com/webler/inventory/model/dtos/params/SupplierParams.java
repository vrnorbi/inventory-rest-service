package com.webler.inventory.model.dtos.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierParams {
    private String name = "";
    private String iban = "";
    private String url = "";
    private Integer rating = 0;
}
