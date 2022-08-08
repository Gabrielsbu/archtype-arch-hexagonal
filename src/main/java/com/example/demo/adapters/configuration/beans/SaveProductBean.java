package com.example.demo.adapters.configuration.beans;


import com.example.demo.application.core.useCase.products.SaveProductUseCaseImpl;
import com.example.demo.application.core.useCase.products.SaveProductUseCasePort;
import com.example.demo.application.ports.out.LogPort;
import com.example.demo.application.ports.out.persistence.SaveProductOutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaveProductBean {

    private final SaveProductOutPort saveProductOutPort;
    private final LogPort logPort;

    public SaveProductBean(SaveProductOutPort saveProductOutPort, LogPort logPort) {
        this.saveProductOutPort = saveProductOutPort;
        this.logPort = logPort;
    }

    @Bean
    public SaveProductUseCasePort saveProductUseCasePort() {
        return new SaveProductUseCaseImpl(saveProductOutPort, logPort);
    }
}
