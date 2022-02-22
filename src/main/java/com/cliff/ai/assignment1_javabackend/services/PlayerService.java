package com.cliff.ai.assignment1_javabackend.services;

import com.cliff.ai.assignment1_javabackend.Entities.Player;

import java.util.List;

public interface PlayerService {
    Player savePlayer(Player player);
    Player updatePlayer(Player player);
    void deletePlayer(Integer player_id);
    Player getPlayerById(Integer player_id);
    List<Player> getAllPlayer();
    
}
