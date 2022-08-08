package com.example.demo.adapters.outbound.persistence.product;

import com.example.demo.adapters.outbound.persistence.product.RepositoryJPA.ProductRepositoryJPA;
import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.core.repository.ProductRepository;
import com.example.demo.application.ports.out.persistence.DeleteProductByIdOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteProductByIdOutboundAdapter implements DeleteProductByIdOutPort {

    private final ProductRepository productRepository;

    @Override
    public void deleteById(String id) throws GlobalException {
        productRepository.deleteById(id);
    }
}
