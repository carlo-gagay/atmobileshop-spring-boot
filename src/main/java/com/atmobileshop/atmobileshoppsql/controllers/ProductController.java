package com.atmobileshop.atmobileshoppsql.controllers;

import java.util.List;

import com.atmobileshop.atmobileshoppsql.entities.Product;
import com.atmobileshop.atmobileshoppsql.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/products")
public class ProductController {

    private final ProductService ProductService;

    @Autowired
    public ProductController(ProductService ProductService) {
        this.ProductService = ProductService;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Product>> index() {
        List<Product> product = this.ProductService.findAll();
        return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
    }

}
