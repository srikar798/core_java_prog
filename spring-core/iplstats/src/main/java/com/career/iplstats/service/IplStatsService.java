package com.career.iplstats.service;

import com.career.iplstats.domain.PlayerDetails;
import com.career.iplstats.dto.RoleAmountDto;
import com.career.iplstats.dto.RoleCountDto;
import com.career.iplstats.dto.TeamAmountStatsDto;
import com.career.iplstats.repo.IplStatsRepo;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IplStatsService {

    TeamAmountStatsDto getTeamAmountStats();
    List<RoleAmountDto> getRoleAmountStats();
    List<String> getTeamNames();
    List<PlayerDetails> getPlayersOf(String teamName);
    RoleAmountDto getRoleAmountStats(String teamName);




}
