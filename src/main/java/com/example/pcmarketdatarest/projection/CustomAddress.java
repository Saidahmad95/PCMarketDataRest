package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomAddress", types = {Address.class})
public interface CustomAddress {
    Integer getId();

    String getCity();

    String getStreet();

    String getHomeNumber();
}
