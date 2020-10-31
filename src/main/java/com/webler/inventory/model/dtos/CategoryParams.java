package com.webler.inventory.model.dtos;

public class CategoryParams {

    private String name = "";

    public CategoryParams(){}

    public CategoryParams(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
