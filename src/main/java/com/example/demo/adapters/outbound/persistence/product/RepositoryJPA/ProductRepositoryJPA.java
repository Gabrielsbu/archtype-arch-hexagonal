package com.example.demo.adapters.outbound.persistence.product.RepositoryJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryJPA extends JpaRepository<ProductEntity, String> {

}
