package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.Post;
import com.example.pcmarketdatarest.projection.CustomPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "post", excerptProjection = CustomPost.class)
public interface PostRepository extends JpaRepository<Post, Integer> {
}
