package com.springboot.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.microservice.model.Team;
import com.springboot.microservice.model.TeamRepository;

@Component
public class StartupInit {

	@Autowired
	private TeamRepository teamRepository;
	
	@PostConstruct
	public void init() {
		List<Team> teams = new ArrayList<Team>();
		
		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		team.setMascotte("None");
		teams.add(team);
		
		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		team.setMascotte("None");
		teams.add(team);
		
		teamRepository.save(teams);
	}
	
}
