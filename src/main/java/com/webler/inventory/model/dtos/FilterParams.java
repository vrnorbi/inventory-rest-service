package com.webler.inventory.model.dtos;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class FilterParams {

    private String name = "";

    private String category = "";

    private String brand = "";

    private Integer fromPrice = MIN_VALUE;

    private Integer toPrice = MAX_VALUE;

    private String supplier = "";

    private String manufacturer = "";

    public FilterParams() {

    }

    public FilterParams(String name, String category, String brand, Integer fromPrice, Integer toPrice, String supplier, String manufacturer) {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.fromPrice = fromPrice;
        this.toPrice = toPrice;
        this.supplier = supplier;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFromPrice() {
        return fromPrice;
    }

    public void setFromPrice(Integer fromPrice) {
        this.fromPrice = fromPrice;
    }

    public Integer getToPrice() {
        return toPrice;
    }

    public void setToPrice(Integer toPrice) {
        this.toPrice = toPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
