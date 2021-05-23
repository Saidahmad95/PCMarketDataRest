package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Basket;
import com.example.pcmarketdatarest.projection.CustomBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "basket", excerptProjection = CustomBasket.class)
public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
