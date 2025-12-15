package com.sadykov.online_shop.infrastructure.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataProductJpaRepository extends JpaRepository<ProductEntity,Long> {
}
