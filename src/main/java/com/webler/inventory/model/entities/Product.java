package com.webler.inventory.model.entities;

import com.webler.inventory.model.dtos.StatsDto;

import javax.persistence.*;

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
                        }
                )
        }
)
@NamedNativeQuery(
        name = "Product.findLowestPriceInCategory",
        query = "SELECT " +
                "  p.id, " +
                "  t.category_name name, " +
                "  p.price value " +
                "FROM product p " +
                "JOIN " +
                "( " +
                "  SELECT c.id category_id, c.name category_name, MIN(price) price " +
                "  FROM product pr " +
                "  INNER JOIN category c ON pr.category_id = c.id " +
                "  GROUP BY pr.category_id " +
                ") t " +
                "ON p.category_id = t.category_id " +
                "AND p.price = t.price",
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
