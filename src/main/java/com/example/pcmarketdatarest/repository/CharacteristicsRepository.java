package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Characteristics;
import com.example.pcmarketdatarest.projection.CustomCharacteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "characteristics", excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {
}
