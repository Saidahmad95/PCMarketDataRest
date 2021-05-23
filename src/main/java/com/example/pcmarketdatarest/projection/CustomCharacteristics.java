package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Characteristics;
import com.example.pcmarketdatarest.entity.Details;
import com.example.pcmarketdatarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomCharacteristics", types = {Characteristics.class})
public interface CustomCharacteristics {
    Integer getId();

    Details getDetails();

    Double getValue();

    Product getProduct();
}
