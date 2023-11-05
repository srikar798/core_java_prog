package com.meta.cj.day21.iplstats;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

public class IplStatsService {

    private List<Player> players;

    public IplStatsService(){
        JsonUtil jsonUtil = new JsonUtil();
        players = jsonUtil.loadPlayers();
    }

    public List<TeamStats> getTeamStats(){
        List<TeamStats> teamStatsList = new ArrayList<>();
        List<String> teamNames = getUniqueTeams();

        for(String team : teamNames){
            double totalAmount = 0;
            for(Player player : players){
                if(team.equals(player.teamName())){
                    totalAmount += player.amount();
                }
            }
            TeamStats teamStats = new TeamStats(team,totalAmount);
            teamStatsList.add(teamStats);
        }

        return teamStatsList;
    }

    public List<RoleStats> getRoleStats(){
        List<RoleStats> roleStatsList = new ArrayList<>();
        List<String> roles = getUniqueRoles();
        for(String role : roles){
            double totalAmount = 0;
            for(Player player : players){
                if(role.equals(player.role())){
                    totalAmount += player.amount();
                }
            }
            RoleStats roleStats = new RoleStats(role,totalAmount);
            roleStatsList.add(roleStats);
        }
        return roleStatsList;
    }

    public List<Player> topPaidPlayers(int n) {

        List<Player> playersCopy = new ArrayList<>(players);
        playersCopy.sort((player1, player2) -> Double.compare(player2.amount(), player1.amount()));
        if (n >= playersCopy.size()) {
            return playersCopy;
        } else {
            return playersCopy.subList(0, n);
        }
    }
    public List<String> getUniqueTeams(){
        List<String> teamList = new ArrayList<>();
        for(Player player : players){
            if(!teamList.contains(player.teamName())){
                teamList.add(player.teamName());
            }
        }
        return teamList;
    }
    public List<String> getUniqueRoles(){
        List<String> roleslist = new ArrayList<>();
        for(Player player : players){
            if(!roleslist.contains(player.role())){
                roleslist.add(player.role());
            }
        }
        return roleslist;
    }
}
