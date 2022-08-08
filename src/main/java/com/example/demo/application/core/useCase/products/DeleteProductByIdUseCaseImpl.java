package com.example.demo.application.core.useCase.products;


import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.ports.out.persistence.DeleteProductByIdOutPort;

public class DeleteProductByIdUseCaseImpl implements DeleteProductByIdUseCasePort{

    private final DeleteProductByIdOutPort deleteProductByIdOutPort;

    public DeleteProductByIdUseCaseImpl(DeleteProductByIdOutPort deleteProductByIdOutPort) {
        this.deleteProductByIdOutPort = deleteProductByIdOutPort;
    }

    @Override
    public void deleteById(String id) throws GlobalException {
        deleteProductByIdOutPort.deleteById(id);
    }
}
