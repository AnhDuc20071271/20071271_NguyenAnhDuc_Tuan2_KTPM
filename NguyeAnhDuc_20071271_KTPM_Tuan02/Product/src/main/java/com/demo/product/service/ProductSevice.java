package com.demo.product.service;

import java.util.List;

import com.demo.product.entity.Product;

public interface ProductSevice {
    public List<Product> getAllProduct();
    public void addProduct(Product product);

}
