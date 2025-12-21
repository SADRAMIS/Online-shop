package com.sadykov.online_shop.application.product;

import com.sadykov.online_shop.domain.product.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    Product getById(Long id);

    List<Product> getAll();

    void delete(Long id);
}
