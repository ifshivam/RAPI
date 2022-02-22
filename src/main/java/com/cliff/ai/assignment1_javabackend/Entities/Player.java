package com.cliff.ai.assignment1_javabackend.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer player_id;
    private String name;
    private Integer age;
    private Date created_at;
    private Date updated_at;
    private String team_id;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name=" team_id", nullable=false)
//    private Team team;
}
