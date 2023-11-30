package com.career.iplstats.repo;

import com.career.iplstats.domain.PlayerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IplStatsRepo extends JpaRepository<PlayerDetails, Long> {

    @Query("select distinct p.teamName from PlayerDetails p")
    List<String> getTeamName();
}
