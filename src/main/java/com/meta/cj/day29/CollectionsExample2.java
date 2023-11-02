package com.meta.cj.day29;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meta.cj.day26.iplstats.JsonReaderUtil;
import com.meta.cj.day26.iplstats.Player;

import java.util.Comparator;
import java.util.List;

public class CollectionsExample2 {

    public static void main(String[] args) {


        List<Player> players = JsonReaderUtil.readJson("players.json", new TypeReference<>() {});

        System.out.println(players.size());
       // players.forEach(ele-> System.out.println(ele.getName() + " " + ele.getAmount()+ " " + ele.getTeamName()));
        List<Player> sortedList = players.stream().sorted(Comparator.comparing(Player::getAmount).reversed()
                                    .thenComparing(Player::getTeamName).reversed().thenComparing(Player::getName).reversed()).toList();
        sortedList.forEach(System.out::println);
    }
}
