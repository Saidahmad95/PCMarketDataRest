package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Address;
import com.example.pcmarketdatarest.entity.Attachment;
import com.example.pcmarketdatarest.entity.Users;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CustomUsers", types = {Users.class})
public interface CustomUsers {
    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Address getAddress();

    Attachment getAttachment();
}
