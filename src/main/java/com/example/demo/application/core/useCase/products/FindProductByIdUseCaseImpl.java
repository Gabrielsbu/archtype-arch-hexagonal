package com.example.demo.application.core.useCase.products;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.ports.out.LogPort;
import com.example.demo.application.ports.out.persistence.FindProductByIdOutPort;

public class FindProductByIdUseCaseImpl implements FindProductByIdUseCasePort{

    private final FindProductByIdOutPort findProductByIdOutPort;
    private final LogPort logPort;

    public FindProductByIdUseCaseImpl(FindProductByIdOutPort findProductByIdOutPort,
            LogPort logPort){
        this.findProductByIdOutPort = findProductByIdOutPort;
        this.logPort = logPort;
    }

    @Override
    public Product findById(String id) throws GlobalException {

        Product product = findProductByIdOutPort.findById(id);
        logPort.info("Produto encontrado por id: {}", product);

        return product;
    }
}
