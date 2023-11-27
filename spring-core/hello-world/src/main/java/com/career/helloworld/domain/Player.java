package com.career.helloworld.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="player")
public class Player {
    @Id
    private String name;
    private String role;
    private String team_name;
    private double amount;

}
