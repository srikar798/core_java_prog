package com.career.iplstats.controller;

import com.career.iplstats.service.IplStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
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

}
