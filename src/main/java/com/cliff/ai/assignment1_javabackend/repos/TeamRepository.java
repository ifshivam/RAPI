package com.cliff.ai.assignment1_javabackend.repos;

import com.cliff.ai.assignment1_javabackend.Entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team,Integer> {
}
