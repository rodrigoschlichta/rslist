package com.camfel.rslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camfel.rslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
