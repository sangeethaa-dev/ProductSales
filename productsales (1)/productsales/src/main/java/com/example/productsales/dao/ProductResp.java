package com.example.productsales.dao;



import com.example.productsales.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductResp extends JpaRepository<Product, Long> {
}
