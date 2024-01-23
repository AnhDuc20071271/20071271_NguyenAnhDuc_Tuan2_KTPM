package com.demo.product.reponsity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.product.entity.Product;

public interface ProductReponsity extends JpaRepository<Product,Integer> {
}
