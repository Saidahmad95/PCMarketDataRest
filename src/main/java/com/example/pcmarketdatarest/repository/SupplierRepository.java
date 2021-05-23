package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Supplier;
import com.example.pcmarketdatarest.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
