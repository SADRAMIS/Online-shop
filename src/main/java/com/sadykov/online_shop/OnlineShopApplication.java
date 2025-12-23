package com.sadykov.online_shop;

import com.sadykov.online_shop.domain.product.Product;
import com.sadykov.online_shop.domain.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class OnlineShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

	@Bean
	CommandLineRunner initProducts(ProductRepository productRepository) {
		return args -> {
			if (productRepository.findAll().isEmpty()) {
				Product product = new Product(
						null,
						"Test product",
						"Demo product",
						new BigDecimal("1000.00"),
						10,
						"TEST",
						"ACTIVE",
						LocalDateTime.now()
				);
				productRepository.save(product);
			}
		};
	}
}
