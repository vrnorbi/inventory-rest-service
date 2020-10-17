package com.webler.inventory.model.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchConditions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String category;

    private String brand;

    private Integer price;

    private String supplier;

    private String manufaturer;

    public SearchConditions() {
    }

    public SearchConditions(String name, String category, String brand, Integer price, String supplier, String manufaturer) {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.supplier = supplier;
        this.manufaturer = manufaturer;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public void setManufaturer(String manufaturer) {
        this.manufaturer = manufaturer;
    }
}
