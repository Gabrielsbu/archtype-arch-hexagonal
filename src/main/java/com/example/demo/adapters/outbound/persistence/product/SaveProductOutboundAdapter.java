package com.example.demo.adapters.outbound.persistence.product;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.repository.ProductRepository;
import com.example.demo.application.ports.out.persistence.SaveProductOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaveProductOutboundAdapter implements SaveProductOutPort {

    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
