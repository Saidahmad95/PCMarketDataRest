package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Product;
import com.example.pcmarketdatarest.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
