package com.sadykov.online_shop.application.product;

import com.sadykov.online_shop.domain.product.Product;
import com.sadykov.online_shop.domain.product.ProductNotFoundException;
import com.sadykov.online_shop.domain.product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Product product = getById(id);
        if ("ACTIVE".equals(product.getStatus())) {
            throw new IllegalStateException("Cannot delete ACTIVE product");
        }
        productRepository.deleteById(id);
    }
}
