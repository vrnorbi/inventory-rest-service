package com.webler.inventory.model.dtos.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagingParams {
    private int page = 0;
    private int size = 10;
}
