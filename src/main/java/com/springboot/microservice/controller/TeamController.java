package com.springboot.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.model.Team;
import com.springboot.microservice.model.TeamRepository;

@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeamById(@PathVariable Long id) {
		return teamRepository.findOne(id);
	}

}
