package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Position;
import com.example.pcmarketdatarest.projection.CustomPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "position", excerptProjection = CustomPosition.class)
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
