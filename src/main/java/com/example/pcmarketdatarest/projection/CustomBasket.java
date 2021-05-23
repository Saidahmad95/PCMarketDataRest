package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Basket;
import com.example.pcmarketdatarest.entity.Users;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomBasket", types = {Basket.class})
public interface CustomBasket {
    Integer getId();

    Users getUser();

    Double getSum();

}
