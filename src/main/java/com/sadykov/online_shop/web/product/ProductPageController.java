package com.sadykov.online_shop.web.product;

import com.sadykov.online_shop.application.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductPageController {

    private final ProductService productService;


    public ProductPageController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String productsPage(Model model) {
        model.addAttribute("products", productService.getAll());
        return "products";
    }
}
