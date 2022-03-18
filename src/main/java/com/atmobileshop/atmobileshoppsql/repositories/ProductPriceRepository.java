package com.atmobileshop.atmobileshoppsql.repositories;

import java.util.List;

import com.atmobileshop.atmobileshoppsql.entities.ProductPrice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long> {
    List<ProductPrice> findAll();
}
