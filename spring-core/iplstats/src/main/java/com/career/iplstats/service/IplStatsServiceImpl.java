package com.career.iplstats.service;

import com.career.iplstats.domain.PlayerDetails;
import com.career.iplstats.dto.RoleAmountDto;
import com.career.iplstats.dto.TeamAmountStatsDto;
import com.career.iplstats.repo.IplStatsRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class IplStatsServiceImpl implements IplStatsService{

    private final IplStatsRepo iplStatsRepo;
    @Override
    public TeamAmountStatsDto getTeamAmountStats() {
        return null;
    }

    @Override
    public List<RoleAmountDto> getRoleAmountStats() {
        return null;
    }

    @Override
    public List<String> getTeamNames() {
        List<String> teamNames = iplStatsRepo.getTeamName();
        log.info("Total teams count: {}",teamNames.size());
        return teamNames;
    }

    @Override
    public List<PlayerDetails> getPlayersOf(String teamName) {
        return null;
    }

    @Override
    public RoleAmountDto getRoleAmountStats(String teamName) {
        return null;
    }
}
