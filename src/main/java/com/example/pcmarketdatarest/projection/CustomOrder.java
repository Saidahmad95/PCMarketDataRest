package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Basket;
import com.example.pcmarketdatarest.entity.Orders;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDateTime;

@Projection(name = "CustomOrder", types = {Orders.class})
public interface CustomOrder {
    Integer getId();

    LocalDateTime getDate();

    Basket getBasket();

    String getOrderDetails();
}
