package com.atmobileshop.atmobileshoppsql.entities;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "PRODUCT_PRICE")
public class ProductPrice implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    private double orig;
    private double srp;

    @Temporal(TemporalType.DATE)
    private Date createdAt;
        
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @JsonManagedReference
    private Product product;

    public ProductPrice() {
        this.createdAt = new Date();
    }

    public ProductPrice(double orig, double srp) {
        super();
        this.orig = orig;
        this.srp = srp;
    }

    public ProductPrice(double orig, double srp, Product product) {
        super();
        this.orig = orig;
        this.srp = srp;
        this.product = product;
    }

    public Long getId() {
        return this.id; 
    }

    public Product getProduct() {
        return this.product;
    }

    public double getOrig() {
        return this.orig;
    }

    public double getSrp() {
        return this.srp;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setOrig(double orig) {
        this.orig = orig;
    }

    public void setSrp(double srp) {
        this.srp = srp;
    }
}
