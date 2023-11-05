package com.meta.cj.day21.iplstats;

import java.util.ArrayList;
import java.util.List;

public class IplStatsManager {

    public static void main(String[] args) {

        List<Player> list = new JsonUtil().loadPlayers();
        System.out.println(list.size());
        IplStatsService teams = new IplStatsService();
        System.out.println(teams.getUniqueTeams());
        System.out.println(teams.getRoleStats());
        System.out.println(teams.topPaidPlayers(5));






    }
}
