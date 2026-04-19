package com.example.product.service;
import com.example.product.client.DummyJsonClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    private DummyJsonClient client;

    // ✅ Get all products
    public Map<String, Object> getAllProducts() {
        return client.getAllProducts();
    }

    // ✅ Get product by ID
    @CircuitBreaker(name = "productCB", fallbackMethod = "fallbackProduct")
    public Map<String, Object> getProduct(int id) {
        return client.getProduct(id);
    }

    // ✅ Search products
    public Map<String, Object> searchProducts(String query) {
        return client.searchProducts(query);
    }

    // ✅ Get categories
    public List<String> getCategories() {
        return client.getCategories();
    }

    // ✅ Get products by category
    public Map<String, Object> getProductsByCategory(String category) {
        return client.getProductsByCategory(category);
    }

    // 🔥 Fallback method
    public Map<String, Object> fallbackProduct(int id, Exception ex) {
        return Map.of(
                "id", id,
                "title", "Fallback Product",
                "price", 0,
                "message", "DummyJSON API is down"
        );
    }
}
