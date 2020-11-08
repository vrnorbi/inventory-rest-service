package com.webler.inventory.model.entities;

import com.webler.inventory.model.dtos.StatsDto;

import javax.persistence.*;

import static com.webler.inventory.model.entities.constants.NativeQueries.FIND_BIGGEST_PRICE_DROPS;
import static com.webler.inventory.model.entities.constants.NativeQueries.FIND_LOWEST_PRICE_IN_CATEGORY;

@Entity
@SqlResultSetMapping(
        name = "statsMapping",
        classes = {
                @ConstructorResult(
                        targetClass = StatsDto.class,
                        columns = {
                                @ColumnResult(name = "id"),
                                @ColumnResult(name = "name"),
                                @ColumnResult(name = "value")
                        })})
@NamedNativeQuery(
        name = "Product.findLowestPriceInCategory",
        query = FIND_LOWEST_PRICE_IN_CATEGORY,
        resultSetMapping = "statsMapping"
)
@NamedNativeQuery(
        name = "Product.findBiggestPriceDrops",
        query = FIND_BIGGEST_PRICE_DROPS,
        resultSetMapping = "statsMapping"
)
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private int price;

    private int quantity;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Manufacturer manufacturer;

    @ManyToOne
    private Supplier supplier;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
