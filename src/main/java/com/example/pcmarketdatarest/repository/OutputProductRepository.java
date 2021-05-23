package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.OutputProduct;
import com.example.pcmarketdatarest.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
