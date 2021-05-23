package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Basket;
import com.example.pcmarketdatarest.entity.OutputProduct;
import com.example.pcmarketdatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomOutputProduct", types = {OutputProduct.class})
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Integer getAmount();

    Basket getBasket();
}
