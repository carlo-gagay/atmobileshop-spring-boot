package com.atmobileshop.atmobileshoppsql.config;

import java.util.List;

import com.atmobileshop.atmobileshoppsql.repositories.ProductPriceRepository;
import com.atmobileshop.atmobileshoppsql.repositories.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atmobileshop.atmobileshoppsql.entities.Product;
import com.atmobileshop.atmobileshoppsql.entities.ProductPrice;

@Configuration
public class ProductConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository, ProductPriceRepository productPriceRepository) {
        return args -> {
            Product product1 = new Product(
                "Product 1", 
                "Description 1",
                23
            );

            ProductPrice price1 = new ProductPrice(50, 150);

            price1.setProduct(product1);

            Product product2 = new Product(
                "Product 2",
                "Description 2",
                20
            );

            ProductPrice price2 = new ProductPrice(40, 150);

            price2.setProduct(product2);

            productPriceRepository.saveAll(
                List.of(price1, price2)
            );

            System.out.println("This is testing =================================================================");
        }; 
    }
}
