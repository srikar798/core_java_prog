package com.meta.cj.day21.iplstats;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {


    public List<Player> loadPlayers() {

        ObjectMapper objMapper = new ObjectMapper();
        List<Player> players = new ArrayList<>();
        try {
            players = objMapper.readValue(JsonUtil.class.getResourceAsStream("/players.json"), new TypeReference<>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        return players;
    }
}

