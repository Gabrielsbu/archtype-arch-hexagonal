package com.example.demo.adapters.outbound.persistence.product;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.core.repository.ProductRepository;
import com.example.demo.application.ports.out.persistence.FindProductByIdOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindProductByIdOutboundAdapter implements FindProductByIdOutPort {

    private final ProductRepository productRepository;

    @Override
    public Product findById(String id) throws GlobalException {
        return productRepository.findById(id);

    }
}
