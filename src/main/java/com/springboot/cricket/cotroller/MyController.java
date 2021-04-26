package com.springboot.cricket.cotroller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cricket.entities.Player;
import com.springboot.cricket.services.PlayerList;

@RestController
public class MyController {
	
	@Autowired
	public PlayerList playerlist;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to IPL Cricket";
	}
	
	//get the Players list
	@GetMapping("/players")
	public List<Player> getPlayers(){
		return this.playerlist.getPlayers();
	}
	
	
	//get the Player with id
	@GetMapping("/players/{playerid}")
	public Player getplayer(@PathVariable String playerid){
		return this.playerlist.getPlayer(Long .parseLong(playerid));
	}

	//to add the Players
	@PostMapping("/players")
	public Player addplayers(@RequestBody Player player) {
		return this.playerlist.addplayers(player);
	}
	
	
	//to add the Players
	@PutMapping("/players")
	public Player updateplayer(@RequestBody Player player) {
		return this.playerlist.updateplayer(player);
	}	
	
	
	//to delete the Player with id
	@DeleteMapping("/players/{playerid}")
	public ResponseEntity deleteplayer(@PathVariable String playerid) {
		try {
			this.playerlist.deletepalyer(Long.parseLong(playerid)) ;
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}

