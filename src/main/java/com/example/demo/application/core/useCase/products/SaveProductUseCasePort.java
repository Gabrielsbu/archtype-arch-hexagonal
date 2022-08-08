package com.example.demo.application.core.useCase.products;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.core.useCase.products.response.ProductResponse;

public interface SaveProductUseCasePort {
    ProductResponse save(Product product) throws GlobalException;
}
