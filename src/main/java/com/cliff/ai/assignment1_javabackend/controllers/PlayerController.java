package com.cliff.ai.assignment1_javabackend.controllers;

import com.cliff.ai.assignment1_javabackend.Entities.Player;
import com.cliff.ai.assignment1_javabackend.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public List<Player> displayPlayers(){
        return playerService.getAllPlayer();
    }
    @GetMapping("/players/{player_id}")
    public Player displayPlayerById(@PathVariable Integer player_id){
        return playerService.getPlayerById(player_id);
   }
    @PostMapping("/players")
    public Player savePlayer(@RequestBody Player player){
        return playerService.savePlayer(player);
    }
    @PutMapping("/players{player_id}")
    public Player updatePlayer(@PathVariable Integer player_id,@RequestBody Player player){
        player.setPlayer_id(player_id);
        return playerService.savePlayer(player);
    }
    @DeleteMapping("/player/{player_id}")
    public void deletePlayer(@PathVariable Integer player_id){
        playerService.deletePlayer(player_id);
    }

}
