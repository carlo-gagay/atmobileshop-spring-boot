package com.atmobileshop.atmobileshoppsql.services;

import java.util.List;

import com.atmobileshop.atmobileshoppsql.entities.ProductPrice;
import com.atmobileshop.atmobileshoppsql.repositories.ProductPriceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductPriceService {
    
    private ProductPriceRepository repository;

    @Autowired
    public ProductPriceService(ProductPriceRepository repository) {
        this.repository = repository;
    }

    public List<ProductPrice> findAll() {
        return this.repository.findAll();
    }

    public ProductPrice save(ProductPrice productPrice) {
        return this.repository.saveAndFlush(productPrice);
    }

}
