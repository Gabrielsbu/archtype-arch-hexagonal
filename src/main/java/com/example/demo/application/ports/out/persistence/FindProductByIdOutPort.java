package com.example.demo.application.ports.out.persistence;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;

public interface FindProductByIdOutPort {
    Product findById(String id) throws GlobalException;
}
