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

    @Column(name = "title", length = 80, nullable = false, unique = true)
    private String title;

    @Column(name = "description", nullable = true, unique = true)
    private String description;

    @Column(name = "quantity", nullable = true, unique = false)
    private int quantity;

    @Temporal(TemporalType.DATE)
    private Date created_at;

    @Temporal(TemporalType.DATE)
    private Date updated_at;

    @OneToOne(mappedBy = "product")
    @JsonBackReference
    private ProductPrice price;

    public Product() {
        this.created_at = new Date();
        this.updated_at = new Date();
    }

    public Product(String title, String description, int quantity) {
        super();
        this.title = title;
        this.description = description;
        this.quantity = quantity;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Date getCreatedAt() {
        return this.created_at;
    }

    public Date getUpdatedAt() {
        return this.updated_at;
    }

    public ProductPrice getPrice() {
        return this.price;
    }

    public void setPrice(ProductPrice price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public void setUpdatedAt(Date updated_at) {
        this.updated_at = updated_at;
    }
}
