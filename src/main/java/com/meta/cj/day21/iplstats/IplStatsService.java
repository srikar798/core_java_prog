package com.meta.cj.day21.iplstats;

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

    public List<String> getUniqueTeams(){
        List<String> teamList = new ArrayList<>();
        for(Player player : players){
            if(!teamList.contains(player.teamName())){
                teamList.add(player.teamName());
            }
        }
        return teamList;
    }
}
