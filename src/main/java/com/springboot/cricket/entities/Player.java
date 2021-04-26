package com.springboot.cricket.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
		
	@Id
	private long id;
	private String name;
	private String team;
	private String role;
	
	
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Player(long id, String name, String team, String role) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
		this.role = role;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team=" + team + ", role=" + role + "]";
	}
	
	
	
}
