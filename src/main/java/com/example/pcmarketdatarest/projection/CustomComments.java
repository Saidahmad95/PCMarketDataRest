package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Comments;
import com.example.pcmarketdatarest.entity.Users;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomComments", types = {Comments.class})
public interface CustomComments {
    Integer getId();

    String getContent();

    Users getUser();

    Integer getNumOfStars();
}
