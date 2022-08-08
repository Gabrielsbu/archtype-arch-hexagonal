package com.example.demo.application.core.repository;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;

public interface ProductRepository {

    Product findById(String id) throws GlobalException;

    Product save(Product product);

    void deleteById(String id) throws GlobalException;

}
