package com.webler.inventory.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String brandType;

    private String mainProduct;

    private Integer brandsProductInInventory;

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

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public String getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(String mainProduct) {
        this.mainProduct = mainProduct;
    }

    public Integer getBrandsProductInInventory() {
        return brandsProductInInventory;
    }

    public void setBrandsProductInInventory(Integer brandsProductInInventory) {
        this.brandsProductInInventory = brandsProductInInventory;
    }
}
