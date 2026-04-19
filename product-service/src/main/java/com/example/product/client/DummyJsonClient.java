package com.example.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "dummyjson", url = "https://dummyjson.com")
public interface DummyJsonClient {
    @GetMapping("/products")
    Map<String, Object> getAllProducts();

    @GetMapping("/products/{id}")
    Map<String, Object> getProduct(@PathVariable int id);

    @GetMapping("/products/search")
    Map<String, Object> searchProducts(@RequestParam("q") String query);

    @GetMapping("/products/categories")
    List<String> getCategories();

    @GetMapping("/products/category/{category}")
    Map<String, Object> getProductsByCategory(@PathVariable String category);
}
