package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Address;
import com.example.pcmarketdatarest.entity.Details;
import com.example.pcmarketdatarest.projection.CustomDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "details", excerptProjection = CustomDetails.class)
public interface DetailsRepository extends JpaRepository<Details, Integer> {
}
