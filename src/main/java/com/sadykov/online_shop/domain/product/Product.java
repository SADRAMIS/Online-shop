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
    private final String status;
    private final LocalDateTime createdAt;

    public Product(Long id,
                   String name,
                   String description,
                   BigDecimal price,
                   int quantity,
                   String category,
                   String status,
                   LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
