package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Address;
import com.example.pcmarketdatarest.projection.CustomAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "address", excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
