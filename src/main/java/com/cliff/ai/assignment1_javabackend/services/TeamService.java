package com.cliff.ai.assignment1_javabackend.services;

import com.cliff.ai.assignment1_javabackend.Entities.Player;
import com.cliff.ai.assignment1_javabackend.Entities.Team;

import java.util.List;

public interface TeamService {
    Team saveTeam(Team team);
    Team updateTeam(Team team);
    void deleteTeam(Integer team_id);
    Team getTeamById(Integer team_id);
    List<Team> getAllTeam();
//    List<Player> getAllPlayerByTeamId(Integer team_id);
}
