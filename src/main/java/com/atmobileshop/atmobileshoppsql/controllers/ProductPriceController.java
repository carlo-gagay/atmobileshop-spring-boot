package com.atmobileshop.atmobileshoppsql.controllers;

import java.util.List;

import com.atmobileshop.atmobileshoppsql.entities.ProductPrice;
import com.atmobileshop.atmobileshoppsql.services.ProductPriceService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product-prices")
public class ProductPriceController {
    
    private ProductPriceService productPriceService;

    public ProductPriceController (ProductPriceService productPriceService) {
        this.productPriceService = productPriceService;
    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<List<ProductPrice>> index() {
        List<ProductPrice> productPrices = this.productPriceService.findAll();
        return new ResponseEntity<List<ProductPrice>>(productPrices, HttpStatus.OK);
    }

}

