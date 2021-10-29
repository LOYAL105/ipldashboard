package com.betterreades.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.betterreades.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

	Team findByTeamName(String teamName);
}
