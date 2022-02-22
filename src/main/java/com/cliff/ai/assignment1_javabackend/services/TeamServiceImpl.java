package com.cliff.ai.assignment1_javabackend.services;
import com.cliff.ai.assignment1_javabackend.Entities.Player;
import com.cliff.ai.assignment1_javabackend.Entities.Team;
import com.cliff.ai.assignment1_javabackend.repos.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeamServiceImpl implements TeamService{
    @Autowired
    private TeamRepository teamRepository;
    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team updateTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Integer team_id) {
          teamRepository.deleteById(team_id);
    }

    @Override
    public Team getTeamById(Integer team_id) {
        return teamRepository.findById(team_id).get();
    }

    @Override
    public List<Team> getAllTeam() {
        return teamRepository.findAll();
    }

//    @Override
//    public List<Player> getAllPlayerByTeamId(Integer team_id) {
//        return null;
//    }
}
