package com.career.iplstats.repo;

import com.career.iplstats.domain.PlayerDetails;
import com.career.iplstats.dto.CountryCountStats;
import com.career.iplstats.dto.RoleAmountDto;
import com.career.iplstats.dto.TeamAmountStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IplStatsRepo extends JpaRepository<PlayerDetails, Long> {

    @Query("select distinct p.teamName from PlayerDetails p")
    List<String> getTeamName();

    @Query("select new com.career.iplstats.dto.TeamAmountStatsDto(p.teamName as teamName,sum(p.amount) as totalAmount) from PlayerDetails p group by teamName")
    List<TeamAmountStatsDto> findTeamAmountStats();

    List<PlayerDetails> findByTeamName(String teamName);

    @Query("select new com.career.iplstats.dto.CountryCountStats(p.countryName countryName, count(p.countryName) count) from PlayerDetails p group by p.countryName")
    List<CountryCountStats> findCountryCountStats();

    @Query("select new com.career.iplstats.dto.RoleAmountDto(p.roleName as roleName, sum(p.amount) as totalAmount) from PlayerDetails p group by p.roleName")
    List<RoleAmountDto> findRoleAmountStats();
    @Query("select new com.career.iplstats.dto.RoleAmountDto(p.roleName roleName,sum(p.amount) totalAmount) from PlayerDetails p where p.teamName=:teamName group by p.amount")
    List<RoleAmountDto> findRoleAmountOfTeam(@Param("teamName")String teamName);

    @Query("select new com.career.iplstats.dto.CountryCountStats(p.countryName countryName, count(p.countryName) count) from PlayerDetails p where p.teamName=:teamName and p.roleName=:roleName group by p.countryName")
    List<CountryCountStats> findCountryCountStats(@Param("teamName")String teamName,@Param("roleName") String roleName);


    boolean existsByTeamName(String teamName);

}
