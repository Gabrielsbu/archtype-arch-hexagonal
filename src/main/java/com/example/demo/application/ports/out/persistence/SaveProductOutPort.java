package com.example.demo.application.ports.out.persistence;

import com.example.demo.application.core.domain.Product;

public interface SaveProductOutPort {
    Product save(Product product);
}
