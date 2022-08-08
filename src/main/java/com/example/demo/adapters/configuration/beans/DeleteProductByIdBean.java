package com.example.demo.adapters.configuration.beans;


import com.example.demo.application.core.useCase.products.DeleteProductByIdUseCaseImpl;
import com.example.demo.application.core.useCase.products.DeleteProductByIdUseCasePort;
import com.example.demo.application.ports.out.persistence.DeleteProductByIdOutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteProductByIdBean {

    private final DeleteProductByIdOutPort deleteProductByIdOutPort;


    public DeleteProductByIdBean(DeleteProductByIdOutPort deleteProductByIdOutPort) {
        this.deleteProductByIdOutPort = deleteProductByIdOutPort;
    }

    @Bean
    public DeleteProductByIdUseCasePort deleteProductByIdOutPort() {
        return new DeleteProductByIdUseCaseImpl(deleteProductByIdOutPort);
    }
}
