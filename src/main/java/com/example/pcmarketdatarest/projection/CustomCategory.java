package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomCategory", types = {Category.class})
public interface CustomCategory {
    Integer getId();

    String getName();

    Category getParentCategory();

}
