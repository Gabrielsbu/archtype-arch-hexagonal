package com.example.demo.adapters.configuration.beans;


import com.example.demo.application.core.useCase.products.FindProductByIdUseCaseImpl;
import com.example.demo.application.core.useCase.products.FindProductByIdUseCasePort;
import com.example.demo.application.ports.out.LogPort;
import com.example.demo.application.ports.out.persistence.FindProductByIdOutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindProductByIdBean {

    private final FindProductByIdOutPort findProductByIdOutPort;
    private final LogPort logPort;

    public FindProductByIdBean(FindProductByIdOutPort findProductByIdOutPort, LogPort logPort) {
        this.findProductByIdOutPort = findProductByIdOutPort;
        this.logPort = logPort;
    }

    @Bean
    public FindProductByIdUseCasePort findProductByIdUseCasePort() {
        return new FindProductByIdUseCaseImpl(findProductByIdOutPort, logPort);
    }
}
