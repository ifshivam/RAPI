package com.cliff.ai.assignment1_javabackend.controllers;

import com.cliff.ai.assignment1_javabackend.Entities.Team;
import com.cliff.ai.assignment1_javabackend.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {
   @Autowired
   TeamService teamService;
    @GetMapping("/teams")
    public List<Team> displayteams(){
        return teamService.getAllTeam();
    }
    @GetMapping("/teams/{team_id}")
    public Team displayteamById(@PathVariable Integer team_id){
        return teamService.getTeamById(team_id);
    }
    @PostMapping("/teams")
    public Team saveTeam(@RequestBody Team team){
        return teamService.saveTeam(team);
    }
    @PutMapping("/teams{team_id}")
    public Team updateTeam(@PathVariable Integer team_id,@RequestBody Team team){
        team.setTeam_id(team_id);
        return teamService.saveTeam(team);
    }
    @DeleteMapping("/team/{team_id}")
    public void deleteTeam(@PathVariable Integer team_id){
        teamService.deleteTeam(team_id);
    }

}
