package com.atmobileshop.atmobileshoppsql.services;

import java.util.List;

import com.atmobileshop.atmobileshoppsql.entities.Product;

public interface IProductService {
    List<Product> findAll();
}
