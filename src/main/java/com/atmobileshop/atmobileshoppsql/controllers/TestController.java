package com.atmobileshop.atmobileshoppsql.controllers;

import com.atmobileshop.atmobileshoppsql.entities.Product;
import com.atmobileshop.atmobileshoppsql.entities.ProductPrice;
import com.atmobileshop.atmobileshoppsql.services.ProductPriceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    
    private ProductPriceService productPriceService;

    @Autowired
    public TestController(ProductPriceService productPriceService) {
        this.productPriceService = productPriceService;
    }

    @GetMapping("/add-product")
    public void addProduct() {
        Product product = new Product("New Product", "description", 23);
        ProductPrice price = new ProductPrice(150, 350);
        price.setProduct(product);

        this.productPriceService.save(price);
    }

}
