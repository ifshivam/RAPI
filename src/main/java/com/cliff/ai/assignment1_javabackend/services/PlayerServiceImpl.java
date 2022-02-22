package com.cliff.ai.assignment1_javabackend.services;

import com.cliff.ai.assignment1_javabackend.Entities.Player;
import com.cliff.ai.assignment1_javabackend.repos.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public  Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Integer player_id) {
      playerRepository.deleteById(player_id);
    }

    @Override
    public Player getPlayerById(Integer player_id) {
        return playerRepository.findById(player_id).get();
    }

    @Override
    public List<Player> getAllPlayer() {
        return playerRepository.findAll();
    }
}
