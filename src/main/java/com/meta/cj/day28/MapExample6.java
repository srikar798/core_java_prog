package com.meta.cj.day28;
import com.fasterxml.jackson.core.type.TypeReference;
import com.meta.cj.day26.iplstats.Player;
import com.meta.cj.day26.iplstats.JsonReaderUtil;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample6 {

    public static void main(String[] args) {



        List<Player> players = JsonReaderUtil.readJson("players.json", new TypeReference<>() {});

        List<String> teams = players.stream().map(Player::getTeamName).distinct().toList();
        List<String> roles = players.stream().map(Player::getRole).distinct().toList();

        // Get team wise player details

        Map<String, List<Player>> playerDetailsMap = new HashMap<>();

        for(String team: teams){
            playerDetailsMap.put(team,getPlayersByTeams(team,players));
            System.out.println(team + " : " + playerDetailsMap.get(team));
        }

        System.out.println("-".repeat(100));
        // Get player details based on role

        Map<String, List<Player>> roleWisePlayerMap = new HashMap<>();

        for(String role: roles){
            roleWisePlayerMap.put(role,getPlayersByRoles(role,players));
            System.out.println(role + " : " + roleWisePlayerMap.get(role));
        }
        System.out.println("-".repeat(100));

        // Get teamName and count of players in each team

        Map<String, Long> teamNameCountMap = getTeamNameAndCount(players);

        System.out.println(teamNameCountMap);

        System.out.println("-".repeat(100));

        // Get team and role wise player details
        Map<String,Map<String,List<Player>>> teamRoleWisePlayerMap = getTeamRoleWisePlayers(teams,roles,players);
        for(String team: teams){
            for(String role : roles){
                System.out.println(team + " : "+ role + "\n" + teamRoleWisePlayerMap.get(team).get(role));
            }
        }


    }
    private static Map<String,Long> getTeamNameAndCount(List<Player> players){
        return players.stream().collect(Collectors.groupingBy(Player::getTeamName,Collectors.counting()));
    }

    private static List<Player> getPlayersByTeams(String team,List<Player> players){
        return players.stream().filter(player -> player.getTeamName().equals(team)).toList();
    }
    private static List<Player> getPlayersByRoles(String role,List<Player> players){
        return players.stream().filter(player -> player.getRole().equals(role)).toList();
    }

    private static Map<String,Map<String,List<Player>>> getTeamRoleWisePlayers(List<String> teams,List<String> roles,List<Player> players){
        Map<String,Map<String,List<Player>>> playersByTeams = new HashMap<>();
        Map<String,List<Player>> playersByRoles = new HashMap<>();
        for(String team : teams){
            for(String role : roles){
                List<Player> playerByRole = players.stream().filter(player -> player.getRole().equals(role)).toList();
                playersByRoles.put(role,playerByRole);
            }
            playersByTeams.put(team,playersByRoles);

        }
        return playersByTeams;
    }
}
