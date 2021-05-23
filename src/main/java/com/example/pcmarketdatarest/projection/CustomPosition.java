package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Position;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomPosition", types = {Position.class})
public interface CustomPosition {
    Integer getId();

    String getName();

}
