package com.example.pcmarketdatarest.repository;

import com.example.pcmarketdatarest.entity.TeamMember;
import com.example.pcmarketdatarest.projection.CustomTeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "member", excerptProjection = CustomTeamMember.class)
public interface TeamMemberRepository extends JpaRepository<TeamMember, Integer> {
}
