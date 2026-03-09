package com.marketplace.marketplaceapi.product.api;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<String> findAll() {
        return List.of("Laptop", "Phone", "Tablet");
    }
}
