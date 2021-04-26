package com.springboot.cricket.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.cricket.dao.PlayerDao;
import com.springboot.cricket.entities.Player;


@Service
public class PlayersListimp implements PlayerList{
	
	@Autowired
	private PlayerDao playerdao;
	//List<Player> list;
	
	public PlayersListimp() {
		
		/*
		 * list = new ArrayList<>(); list.add(new Player(1, "Shubham Naik",
		 * "RCB","All-Rounder")); list.add(new Player(2, "Virat Kohli",
		 * "RCB","Batsman")); list.add(new Player(3, "Dhoni", "CSK","WK-Batsman"));
		 * list.add(new Player(4, "Rohit", "MI","Batsman"));
		 */
		
	}
	
	
	public List<Player> getPlayers(){
		
		return playerdao.findAll();
	}

	@Override
	public Player getPlayer(long playerid) {
		
		/*
		 * Player p=null; for(Player player:list) { if(player.getId()==playerid) {
		 * p=player; } }
		 */
		return playerdao.getOne(playerid);
		
	}

	@Override
	public Player addplayers(Player player) {
		//list.add(player);
		playerdao.save(player);
		return player;
	}

	@Override
	public Player updateplayer(Player player) {
			
		/*
		 * list.forEach(e -> { if(e.getId() == player.getId()) {
		 * e.setName(player.getName()); e.setTeam(player.getTeam());
		 * e.setRole(player.getRole()); } });
		 */
		playerdao.save(player);
		return player;
	}


	@Override
	public Player deletepalyer(long parseLong) {
		//list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		//return null;
		Player entity = playerdao.getOne(parseLong);
		playerdao.delete(entity);
		return entity;
	}
	
	
	/*@Override
	 * 
	 * /*
		 * Player p=null; for(Player player:list) { if(player.getId()==playerid) {
		 * p=player; list.remove(p); }
		 }
	public Player deleteplayer(long playerid) {
		
		Player player = findById(playerid);

		if (player == null)
			return null;

		if (list.remove(player)) {
			return player;
		}

		return null;
	
	}

	public Player findById(long playerid) {
		for (Player player : list) {
		if(player.getId() == playerid) {
				return player;
			}
		}
		return null;
	}*/

}
