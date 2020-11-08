package com.webler.inventory.model.dtos.params;

public class ManufacturerFilterParams {

    private String name = "";

    private String country = "";

    private String url = "";

    private Integer rating = 0;

    public ManufacturerFilterParams(){

    }

    public ManufacturerFilterParams(String name, String country, String url, Integer rating) {
        this.name = name;
        this.country = country;
        this.url = url;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
