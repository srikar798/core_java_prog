package com.career.iplstats.service;

import com.career.iplstats.domain.PlayerDetails;
import com.career.iplstats.dto.CountryCountStats;
import com.career.iplstats.dto.RoleAmountDto;
import com.career.iplstats.dto.TeamAmountStatsDto;
import com.career.iplstats.exception.TeamNotFoundException;
import com.career.iplstats.repo.IplStatsRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class IplStatsServiceImpl implements IplStatsService{

    private final IplStatsRepo iplStatsRepo;
    @Override
    public List<TeamAmountStatsDto> getTeamAmountStats() {
        List<TeamAmountStatsDto> teamAmountStats = iplStatsRepo.findTeamAmountStats();
        log.info("Total teams found : {}",teamAmountStats.size());
        return teamAmountStats;
    }

    @Override
    public List<RoleAmountDto> getRoleAmountStats() {

        List<RoleAmountDto> roleAmount = iplStatsRepo.findRoleAmountStats();
        log.info("Total roles found : {}",roleAmount.size());
        return roleAmount;
    }

    @Override
    public List<CountryCountStats> getCountryCountStats(String teamName, String roleName) {
       Assert.notNull(teamName,"Team name should not be null");
       Assert.notNull(roleName, " Role name should not be null");
       List<CountryCountStats> countryCountStats = iplStatsRepo.findCountryCountStats(teamName,roleName);
       log.info(" With role{} and team {} has {} players",roleName,teamName,countryCountStats.size());
       return countryCountStats;
    }

    @Override
    public List<String> getTeamNames() {
        List<String> teamNames = iplStatsRepo.getTeamName();
        log.info("Total teams count: {}",teamNames.size());
        return teamNames;
    }

    @Override
    public List<PlayerDetails> getPlayersOf(String teamName) {
        Assert.notNull(teamName,"Team name should not be null");
        if(!iplStatsRepo.existsByTeamName(teamName)){
            log.info("team name {} not found",teamName);
            throw new TeamNotFoundException("Team with the name :" + teamName + " not found");
        }
        List<PlayerDetails> playerDetails = iplStatsRepo.findByTeamName(teamName);
        log.info("Total players found for team {} is {}",teamName,playerDetails.size());
        return playerDetails;
    }

    @Override
    public List<RoleAmountDto> getRoleAmountStats(String teamName) {

        List<RoleAmountDto> roleAmountStats = iplStatsRepo.findRoleAmountOfTeam(teamName);
        log.info("Total amount for roles is {}",roleAmountStats.size());
        return roleAmountStats;

    }


    @Override
    public List<CountryCountStats> getCountryCountStats() {
       List<CountryCountStats> countryCountStats = iplStatsRepo.findCountryCountStats();
        log.info("Total countries  are {}",countryCountStats.size());
        return countryCountStats;
    }

    @Override
    public List<PlayerDetails> getAllPlayers() {
        return iplStatsRepo.findAll();
    }
}
