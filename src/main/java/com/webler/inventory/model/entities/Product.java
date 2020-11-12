package com.webler.inventory.model.entities;

import com.webler.inventory.model.dtos.StatsDto;
import lombok.Data;

import javax.persistence.*;

import static com.webler.inventory.model.entities.constants.NativeQueries.FIND_BIGGEST_PRICE_DROPS;
import static com.webler.inventory.model.entities.constants.NativeQueries.FIND_LOWEST_PRICE_IN_CATEGORY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@SqlResultSetMapping(
        name = "statsMapping",
        classes = {
                @ConstructorResult(
                        targetClass = StatsDto.class,
                        columns = {
                                @ColumnResult(name = "id"),
                                @ColumnResult(name = "name"),
                                @ColumnResult(name = "name2"),
                                @ColumnResult(name = "value")
                        })})
@SqlResultSetMapping(
        name = "priceDropMapping",
        classes = {
                @ConstructorResult(
                        targetClass = StatsDto.class,
                        columns = {
                                @ColumnResult(name = "id"),
                                @ColumnResult(name = "name"),
                                @ColumnResult(name = "value"),
                                @ColumnResult(name = "value2")
                        })})
@NamedNativeQuery(
        name = "Product.getLowestPricedProductsInAllCategories",
        query = FIND_LOWEST_PRICE_IN_CATEGORY,
        resultSetMapping = "statsMapping"
)
@NamedNativeQuery(
        name = "Product.getProductsWithBiggestPriceDrop",
        query = FIND_BIGGEST_PRICE_DROPS,
        resultSetMapping = "priceDropMapping"
)
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
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

}
