package com.career.helloworld.controller;

import com.career.helloworld.domain.Player;
import com.career.helloworld.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;
    @GetMapping("/all")
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }
}
