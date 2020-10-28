package com.webler.inventory.model.dtos;

public class BrandParams {

    private String name;

    public BrandParams(){

    }

    public BrandParams(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
