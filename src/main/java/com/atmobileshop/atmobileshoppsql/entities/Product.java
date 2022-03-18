package com.atmobileshop.atmobileshoppsql.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @Column(name = "name", length = 80, nullable = false, unique = true)
    private String name;

    @Column(name = "description", nullable = true, unique = true)
    private String description;

    @Column(name = "quantity", nullable = true, unique = false)
    private int quantity;

    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @OneToOne(mappedBy = "product")
    @JsonBackReference
    private ProductPrice price;

    public Product() {
        this.createdAt = new Date();
    }

    public Product(String name, String description, int quantity) {
        super();
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public ProductPrice getPrice() {
        return this.price;
    }

    public void setPrice(ProductPrice price) {
        this.price = price;
    }
}
