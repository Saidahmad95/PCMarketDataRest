package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Attachment;
import com.example.pcmarketdatarest.entity.Post;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomPost", types = {Post.class})
public interface CustomPost {
    Integer getId();

    String getTitle();

    String getBody();

    String getLink();

    Attachment getAttachment();
}
