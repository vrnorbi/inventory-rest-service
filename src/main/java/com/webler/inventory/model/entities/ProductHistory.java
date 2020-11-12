package com.webler.inventory.model.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class ProductHistory {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private Integer quantity;

    private Integer price;

    private Date date;

    @ManyToOne
    private Product product;

}
