package com.example.demo.application.core.useCase.products;


import com.example.demo.application.core.exceptions.GlobalException;

public interface DeleteProductByIdUseCasePort {
    void deleteById(String id) throws GlobalException;
}
