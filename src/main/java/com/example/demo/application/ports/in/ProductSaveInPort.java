package com.example.demo.application.ports.in;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.core.useCase.products.response.ProductResponse;

public interface ProductSaveInPort {
    ProductResponse save(Product product) throws GlobalException;
    Product findById(String id) throws GlobalException;
    void deleteById(String id) throws GlobalException;
}
