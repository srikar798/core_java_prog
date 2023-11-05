package com.meta.cj.day26.iplstats;



import com.fasterxml.jackson.core.type.TypeReference;

import java.util.ArrayList;
import java.util.List;

public class IplStatsServiceImpl implements IplStatsService{

    private final List<Player> players;

    public IplStatsServiceImpl(){
        players = JsonReaderUtil.readJson("players.json", new TypeReference<>() {});
    }

    @Override
    public List<Player> getAllPlayers() {
        return players;
    }

    @Override
    public List<String> getTeamNames() {
        return players.stream().map(Player::getTeamName).distinct().toList();
    }

    @Override
    public List<String> playersByTeam(String teamName) {
        return players.stream().filter(t -> t.getTeamName().equalsIgnoreCase(teamName)).map(Player::getName).toList();
    }

    @Override
    public List<String> playersByRole(String role) {
        return players.stream().filter((t -> t.getRole().equalsIgnoreCase(role))).map(Player::getName).toList();
    }

    @Override
    public List<String> playersByTeamAndRole(String teamName, String role) {
        return players.stream().filter((t -> t.getRole().equalsIgnoreCase(role))).filter(t -> t.getTeamName().equalsIgnoreCase(teamName)).map(Player::getName).toList();
    }

    @Override
    public List<String> getRoleNames() {
        return players.stream().map(Player::getRole).distinct().toList();
    }

    @Override
    public double getMaxAmount() {
        return players.stream().mapToDouble(Player::getAmount).reduce(0.0,Double::max);
    }

    @Override
    public double totalAmountByTeam(String teamName) {
        return players.stream().filter(t -> t.getTeamName().equalsIgnoreCase(teamName)).mapToDouble(Player::getAmount).reduce(0,Double::sum);

    }
}
