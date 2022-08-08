package com.example.demo.application.core.useCase.products;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.core.useCase.products.response.ProductResponse;
import com.example.demo.application.core.useCase.products.validators.ProductValidator;
import com.example.demo.application.ports.out.LogPort;
import com.example.demo.application.ports.out.persistence.SaveProductOutPort;

public class SaveProductUseCaseImpl implements SaveProductUseCasePort{

    private final SaveProductOutPort saveProductOutPort;
    private final LogPort logPort;

    public SaveProductUseCaseImpl(SaveProductOutPort saveProductOutPort, LogPort logPort) {
        this.saveProductOutPort = saveProductOutPort;
        this.logPort = logPort;
    }

    @Override
    public ProductResponse save(Product product) throws GlobalException {
        Product productSaved = saveProductOutPort.save(product);

        ProductValidator.productValidatorError(productSaved);


        logPort.info("result do save do produto: {}", productSaved.toString());
        return new ProductResponse(productSaved.getId(), productSaved.getName(), productSaved.getPrice());

    }
}
