package com.cliff.ai.assignment1_javabackend.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer team_id;
    private String name;
    private String location;
    private Date created_at;
    private Date updated_at;
//    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
//    private List<Player> players;
}



