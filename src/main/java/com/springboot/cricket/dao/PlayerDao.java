package com.springboot.cricket.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.cricket.entities.Player;

public interface PlayerDao extends JpaRepository<Player,Long>{

	

}
