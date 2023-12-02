package com.career.iplstats.repo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IplStatsRepoTest {

    @Autowired
    private IplStatsRepo iplStatsRepo;
    @Test
    void teamExistsTest(){
        boolean actualResult = iplStatsRepo.existsByTeamName("MI");
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void teamExistsWithInvalidTest(){
        boolean actualResult = iplStatsRepo.existsByTeamName("KSC");
        boolean expectedResult = false;
        Assertions.assertEquals(expectedResult,actualResult);
    }

}
