package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomSupplier", types = {Supplier.class})
public interface CustomSupplier {
    Integer getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getMessage();
}
