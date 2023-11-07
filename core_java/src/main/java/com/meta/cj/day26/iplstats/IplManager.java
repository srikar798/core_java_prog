package com.meta.cj.day26.iplstats;

public class IplManager {
    public static void main(String[] args) {

        IplStatsService service = new IplStatsServiceImpl();
        System.out.println(service.getAllPlayers());
        System.out.println(service.getTeamNames());
        System.out.println(service.playersByTeam("CSK"));
        System.out.println(service.playersByRole("Batsman"));
        System.out.println(service.playersByTeamAndRole("MI","Bowler"));

        System.out.println(service.getRoleNames());
        System.out.println(service.getMaxAmount());
        System.out.println(service.totalAmountByTeam("CSK"));

    }

}
