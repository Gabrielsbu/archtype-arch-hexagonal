package com.example.demo.adapters.inbound.controllers;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.core.useCase.products.DeleteProductByIdUseCasePort;
import com.example.demo.application.core.useCase.products.FindProductByIdUseCasePort;
import com.example.demo.application.core.useCase.products.SaveProductUseCasePort;
import com.example.demo.application.core.useCase.products.response.ProductResponse;
import com.example.demo.application.ports.in.ProductSaveInPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/api")
public class ProductController implements ProductSaveInPort {

    private final SaveProductUseCasePort saveProductUseCasePort;
    private final FindProductByIdUseCasePort findProductByIdUseCasePort;
    private final DeleteProductByIdUseCasePort deleteProductByIdUseCasePort;

    @Override
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProductResponse save(@RequestBody Product product) throws GlobalException {
        return saveProductUseCasePort.save(product);
    }

    @Override
    @GetMapping("/find/{id}")
    public Product findById(@PathVariable(required = false) String id) throws GlobalException {
        return findProductByIdUseCasePort.findById(id);
    }

    @Override
    public void deleteById(String id) throws GlobalException {
        deleteProductByIdUseCasePort.deleteById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable(required = false) String id) throws GlobalException {
        deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
