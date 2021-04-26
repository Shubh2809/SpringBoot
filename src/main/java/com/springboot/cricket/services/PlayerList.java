package com.springboot.cricket.services;

import java.util.List;

import com.springboot.cricket.entities.Player;

public interface PlayerList {

	public List<Player> getPlayers();

	public Player getPlayer(long playerid);

	public Player addplayers(Player player);


	public Player updateplayer(Player player);

	public Player deletepalyer(long parseLong);

}
