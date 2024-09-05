package com.NFL.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NFL.model.Player;
import com.NFL.services.PlayerService;

@RestController
@RequestMapping("NFL_DB/player")
public class PlayerController {
	
	private PlayerService playerService;
	public PlayerController(PlayerService playerService) {
		this.playerService=playerService;
	}

	@GetMapping
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayers();
		}
	
}
