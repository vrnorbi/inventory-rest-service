package com.webler.inventory.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatsDto {
    private Integer id;
    private String name;
    private String name2;
    private Integer value;
    private Integer value2;

    public StatsDto(Integer id, String name, Integer value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public StatsDto(Integer id, String name, String name2, Integer value) {
        this.id = id;
        this.name = name;
        this.name2 = name2;
        this.value = value;
    }

    public StatsDto(Integer id, String name, Integer value, Integer value2) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.value2 = value2;
    }
}
