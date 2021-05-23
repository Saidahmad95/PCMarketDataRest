package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Users;
import com.example.pcmarketdatarest.projection.CustomUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", excerptProjection = CustomUsers.class)
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
