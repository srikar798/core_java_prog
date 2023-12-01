package com.career.iplstats.controller;

import com.career.iplstats.domain.PlayerDetails;
import com.career.iplstats.dto.CountryCountStats;
import com.career.iplstats.dto.RoleAmountDto;
import com.career.iplstats.dto.TeamAmountStatsDto;
import com.career.iplstats.service.IplStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class IplStatsController {

    private final IplStatsService iplStatsService;

    @GetMapping("/teamnames")
    public ResponseEntity<List<String>> getTeamNames(){
        return ResponseEntity.ok(iplStatsService.getTeamNames());
    }
    @GetMapping("/teamamountstats")
    public ResponseEntity<List<TeamAmountStatsDto>> getTeamAmountStats(){
        return ResponseEntity.ok(iplStatsService.getTeamAmountStats());
    }

    @GetMapping("/roleamountstats")
    public  ResponseEntity<List<RoleAmountDto>> getRoleAmountDto(){
        return ResponseEntity.ok(iplStatsService.getRoleAmountStats());
    }


    @GetMapping("/players")
    public ResponseEntity<List<PlayerDetails>> getAllPlayers(){
        return ResponseEntity.ok(iplStatsService.getAllPlayers());
    }


    @GetMapping("/players/{teamName}")
    public ResponseEntity<List<PlayerDetails>> getPlayersOfTeam(@PathVariable("teamName") String teamName){
        return ResponseEntity.ok(iplStatsService.getPlayersOf(teamName));
    }

    @GetMapping("/countrycountstats")
    public ResponseEntity<List<CountryCountStats>> getCountryCountStats() {
        return ResponseEntity.ok(iplStatsService.getCountryCountStats());
    }
    @GetMapping("/countrycountstats/{teamName}/{roleName}")
    public ResponseEntity<List<CountryCountStats>> getCountryCountStats(@PathVariable("teamName")String teamName, @PathVariable("roleName")String roleName){
        return ResponseEntity.ok(iplStatsService.getCountryCountStats(teamName,roleName));
    }

}
