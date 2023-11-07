package com.meta.cj.day29;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meta.cj.day26.iplstats.JsonReaderUtil;
import com.meta.cj.day26.iplstats.Player;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerStatsExample {
    public static void main(String[] args) {
        List<Player> players = JsonReaderUtil.readJson("players.json", new TypeReference<>() {});

        Map<String,Long> list = getTeamNameAndCount(players);
        System.out.println(list);

        Pair<String,Long> list1 = getPlayerCountByTeam(players,"CSK");
        System.out.println(list1);




    }

    private static Map<String,Long> getTeamNameAndCount(List<Player> players){
        return players.stream().collect(Collectors.groupingBy(Player::getTeamName,Collectors.counting() ));
    }

    private static TeamCountDto getPlayerCount(List<Player> players,String teamName){
        TeamCountDto teamCountDto = new TeamCountDto();
        teamCountDto.setTeamName(teamName);
        teamCountDto.setCount(players.stream().filter(e -> e.getTeamName().equals(teamName)).count());
        return teamCountDto;
    }

    private static Pair<String,Long> getPlayerCountByTeam(List<Player> players, String teamName){
        return Pair.of(teamName,players.stream().filter(e -> e.getTeamName().equals(teamName)).count());
    }
}
