package com.meta.cj.day15;

import java.util.List;

enum PlayerRoles{
    BATSMAN , BOWLER , ALL_ROUNDER, WICKET_KEEPER
}
public class AssignemnetQuestion {

    public static void main(String[] args) {

        PlayerClass player1 = new PlayerClass(7, "Dhoni", "CSK", 5000000, PlayerRoles.WICKET_KEEPER);
        PlayerClass player2 = new PlayerClass(45, "Rohit Sharma", "MI", 4500000, PlayerRoles.BATSMAN);
        PlayerClass player3 = new PlayerClass(12, "Andre Russell", "KKR", 700000, PlayerRoles.ALL_ROUNDER);
        PlayerClass player4 = new PlayerClass(77, "Suryakumar Yadav", "MI", 550000, PlayerRoles.BATSMAN);
        PlayerClass player5 = new PlayerClass(55, "Kieron Pollard", "MI", 650000, PlayerRoles.ALL_ROUNDER);
        PlayerClass player6 = new PlayerClass(18, "Virat Kohli", "RCB", 4800000, PlayerRoles.BATSMAN);
        PlayerClass player7 = new PlayerClass(17, "AB de Villiers", "RCB", 550000, PlayerRoles.BATSMAN);
        PlayerClass player8 = new PlayerClass(93, "Jasprit Bumrah", "MI", 450000, PlayerRoles.BOWLER);
        PlayerClass player9 = new PlayerClass(1, "Eoin Morgan", "KKR", 600000, PlayerRoles.BATSMAN);
        PlayerClass player10 = new PlayerClass(74, "Sunil Narine", "KKR", 800000, PlayerRoles.ALL_ROUNDER);


        List<PlayerClass> players = List.of(player1,player2,player3,player4,player5,player6,player7,player8,player9,player10);
        getPlayerDetails(players);
        getBatsmandetails(players);

    }

    private static void getBatsmandetails(List<PlayerClass> players){
        for(PlayerClass player : players){
            if(player.getRole() == PlayerRoles.BATSMAN) {
                System.out.println(player.toString());
            }

        }
        System.out.println("-".repeat(30));
    }
    private static void getPlayerDetails(List<PlayerClass> players){

        for(PlayerClass player : players){
            System.out.println(player.toString());
        }
        System.out.println("-".repeat(30));
    }


}
