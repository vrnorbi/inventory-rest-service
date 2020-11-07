package com.webler.inventory.model.dtos.params;

public class SupplierParams {

    private String name = "";

    private String iban = "";

    private String url = "";

    private Integer rating = 0;

    public SupplierParams(){}

    public SupplierParams(String name, String iban, String url, Integer rating) {
        this.name = name;
        this.iban = iban;
        this.url = url;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
