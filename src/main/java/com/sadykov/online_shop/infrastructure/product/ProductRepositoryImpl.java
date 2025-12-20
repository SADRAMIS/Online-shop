package com.sadykov.online_shop.infrastructure.product;

import com.sadykov.online_shop.domain.product.Product;
import com.sadykov.online_shop.domain.product.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryImpl implements ProductRepository {

    private final SpringDataProductJpaRepository jpaRepository;

    public ProductRepositoryImpl(SpringDataProductJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Product save(Product product) {
        ProductEntity entity = toEntity(product);
        ProductEntity saved = jpaRepository.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return jpaRepository.findById(id).map(this::toDomain);
    }

    @Override
    public List<Product> findAll() {
        return jpaRepository.findAll().stream()
                .map(this::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }

    private ProductEntity toEntity(Product product) {
        ProductEntity entity = new ProductEntity();
        entity.setId(product.getId());
        entity.setName(product.getName());
        entity.setDescription(product.getDescription());
        entity.setPrice(product.getPrice());
        entity.setQuantity(product.getQuantity());
        entity.setCategory(product.getCategory());
        entity.setStatus(product.getStatus());
        entity.setCreatedAt(product.getCreatedAt());
        return entity;
    }

    private Product toDomain(ProductEntity productEntity){
        return new Product(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getPrice(),
                productEntity.getQuantity(),
                productEntity.getCategory(),
                productEntity.getStatus(),
                productEntity.getCreatedAt()
        );
    }
}
