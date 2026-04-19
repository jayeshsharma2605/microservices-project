package com.example.product.controller;

import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;

    // ✅ 1. Get all products
    @GetMapping
    public Map<String, Object> getAllProducts() {
        return service.getAllProducts();
    }

    // ✅ 2. Get product by ID
    @GetMapping("/{id}")
    public Map<String, Object> getProduct(@PathVariable int id) {
        return service.getProduct(id);
    }

    // ✅ 3. Search products
    @GetMapping("/search")
    public Map<String, Object> searchProducts(@RequestParam String q) {
        return service.searchProducts(q);
    }

    // ✅ 4. Get categories
    @GetMapping("/categories")
    public List<String> getCategories() {
        return service.getCategories();
    }

    // ✅ 5. Get products by category
    @GetMapping("/category/{category}")
    public Map<String, Object> getProductsByCategory(@PathVariable String category) {
        return service.getProductsByCategory(category);
    }
}
