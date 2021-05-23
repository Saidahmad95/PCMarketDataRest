package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Comments;
import com.example.pcmarketdatarest.projection.CustomComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comments", excerptProjection = CustomComments.class)
public interface CommentsRepository extends JpaRepository<Comments, Integer> {
}
