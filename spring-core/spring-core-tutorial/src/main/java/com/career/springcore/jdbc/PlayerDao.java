package com.career.springcore.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PlayerDao {

    private final JdbcTemplate jdbcTemplate;

    public Integer countOfPlayers(){
        String COUNT_OF_PLAYERS = "select count(*) from player";
        return jdbcTemplate.queryForObject(COUNT_OF_PLAYERS,Integer.class);
    }
}
