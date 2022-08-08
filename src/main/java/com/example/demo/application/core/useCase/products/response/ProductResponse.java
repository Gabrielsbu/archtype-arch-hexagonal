package com.example.demo.application.core.useCase.products.response;

import java.math.BigDecimal;

public class ProductResponse {

    private String id;
    private String name;
    private BigDecimal price;

    public ProductResponse() {
    }

    public ProductResponse(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
