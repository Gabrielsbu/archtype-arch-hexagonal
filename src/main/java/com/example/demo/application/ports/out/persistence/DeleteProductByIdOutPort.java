package com.example.demo.application.ports.out.persistence;

import com.example.demo.application.core.exceptions.GlobalException;

public interface DeleteProductByIdOutPort {
    void deleteById(String id) throws GlobalException;
}
