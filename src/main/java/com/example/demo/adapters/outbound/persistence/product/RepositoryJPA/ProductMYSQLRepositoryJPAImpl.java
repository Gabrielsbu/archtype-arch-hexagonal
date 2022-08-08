package com.example.demo.adapters.outbound.persistence.product.RepositoryJPA;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.core.repository.ProductRepository;
import com.example.demo.application.core.useCase.products.validators.ProductValidator;
import com.example.demo.application.core.util.validators.ErrorMessage;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductMYSQLRepositoryJPAImpl implements ProductRepository {

    private final ProductRepositoryJPA productRepositoryJPA;

    @Override
    public Product findById(String id) throws GlobalException {
        ProductEntity product = productRepositoryJPA.findById(id)
                .orElseThrow(
                        () -> new GlobalException
                                ("HUB404", "Error in process", LocalDateTime.now(),
                                        Collections.singletonList("Produto não encontrado"),
                                        HttpStatus.NOT_FOUND));
        return product.toProduct();
    }

    @Override
    public Product save(Product product) {
        product.setId(UUID.randomUUID().toString());
        return productRepositoryJPA.save(new ProductEntity(product))
                .toProductWithValue(product.getId(), product.getName(), product.getPrice());
    }

    @Override
    public void deleteById(String id) throws GlobalException {
         try{
             productRepositoryJPA.deleteById(id);
         } catch (EmptyResultDataAccessException e){
             ProductValidator.exceptionDefault(
                     "LOS400",
                     ErrorMessage.requiredField("id"),
                     HttpStatus.BAD_REQUEST);
         }
    }
}
