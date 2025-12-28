package com.sadykov.online_shop.domain.product;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Long id) {
        super("Product not found: " + id);
    }
}
