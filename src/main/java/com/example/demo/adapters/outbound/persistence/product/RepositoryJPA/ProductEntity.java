package com.example.demo.adapters.outbound.persistence.product.RepositoryJPA;

import com.example.demo.application.core.domain.Product;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    private String id;
    private String name;
    private BigDecimal price;

    public Product toProduct() {
        return new Product(id, name, price);
    }

    public Product toProductWithValue(String id, String name, BigDecimal price) {
        return new Product(id, name, price);
    }

    public ProductEntity(Product product) {
        this.id = product.getId();
        this.price = product.getPrice();
        this.name = product.getName();
    }

}
