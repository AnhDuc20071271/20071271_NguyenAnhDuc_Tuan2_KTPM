package com.demo.product.service;

import com.demo.product.entity.Product;
import com.demo.product.reponsity.ProductReponsity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductSeviceImpl implements ProductSevice{
    @Autowired
    private ProductReponsity productReponsity;

    @Override
    public List<Product> getAllProduct() {
        List<Product> products= new ArrayList<>();
        products=productReponsity.findAll();
        return products;
    }

    @Override
    public void addProduct(Product product) {
        productReponsity.save(product);
    }
}
