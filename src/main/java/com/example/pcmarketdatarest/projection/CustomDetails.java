package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Details;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomDetails", types = {Details.class})
public interface CustomDetails {
    Integer getId();

    String getContent();

}
