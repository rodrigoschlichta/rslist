package com.camfel.rslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camfel.rslist.dto.GameMinDTO;
import com.camfel.rslist.entities.Game;
import com.camfel.rslist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto; 
}
	
}
