package com.example.demo.application.core.useCase.products;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;

public interface FindProductByIdUseCasePort {
    Product findById(String id) throws GlobalException;
}
