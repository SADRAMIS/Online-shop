package com.sadykov.online_shop.domain.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private final Long id;
    private final String name;
    private final String description;
    private final BigDecimal price;
    private final int quantity;
    private final String category;
    private ProductStatus productStatus;
    private final LocalDateTime createdAt;

    public Product(Long id,
                   String name,
                   String description,
                   BigDecimal price,
                   int quantity,
                   String category,
                   ProductStatus productStatus,
                   LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.productStatus = productStatus;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
