package com.webler.inventory.model.dtos;

public class StatsDto {

    private Integer id;

    private String name;

    private Integer value;

    private Integer value2;

    public StatsDto() {}

    public StatsDto(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public StatsDto(Integer id, String name, Integer value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public StatsDto(Integer id, String name, Integer value, Integer value2) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.value2 = value2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }
}
