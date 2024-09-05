package com.NFL.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.NFL.model.Player;
import com.NFL.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	private PlayerRepository playerRepository;
	
	public PlayerServiceImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	@Override
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

}
