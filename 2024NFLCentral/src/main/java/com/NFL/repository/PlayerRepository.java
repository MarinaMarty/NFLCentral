package com.NFL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NFL.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	
	//DONE!
}
