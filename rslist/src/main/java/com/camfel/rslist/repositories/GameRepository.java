package com.camfel.rslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camfel.rslist.entities.Game;

public interface GameRepository extends JpaRepository<Game , Long>{

}
