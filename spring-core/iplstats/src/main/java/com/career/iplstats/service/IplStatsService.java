package com.career.iplstats.service;

import com.career.iplstats.domain.PlayerDetails;
import com.career.iplstats.dto.CountryCountStats;
import com.career.iplstats.dto.RoleAmountDto;
import com.career.iplstats.dto.TeamAmountStatsDto;

import java.util.List;


public interface IplStatsService {

    List<TeamAmountStatsDto> getTeamAmountStats();
    List<RoleAmountDto> getRoleAmountStats();
    List<CountryCountStats> getCountryCountStats(String teamName, String roleName);
    List<String> getTeamNames();
    List<PlayerDetails> getPlayersOf(String teamName);
    List<RoleAmountDto> getRoleAmountStats(String teamName);

    List<CountryCountStats> getCountryCountStats();

    List<PlayerDetails> getAllPlayers();

}
