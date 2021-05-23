package com.example.pcmarketdatarest.projection;

import com.example.pcmarketdatarest.entity.Attachment;
import com.example.pcmarketdatarest.entity.Position;
import com.example.pcmarketdatarest.entity.TeamMember;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {TeamMember.class}, name = "CustomTeamMember")
public interface CustomTeamMember {

    Integer getId();

    String getFullName();

    Position getPosition();

    Attachment getAttachment();
}
