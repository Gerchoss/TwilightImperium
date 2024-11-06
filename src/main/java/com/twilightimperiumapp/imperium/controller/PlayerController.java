package com.twilightimperiumapp.imperium.controller;

import com.twilightimperiumapp.imperium.database.PlayerRepository;
import com.twilightimperiumapp.imperium.database.entities.PlayerEntity;
import com.twilightimperiumapp.imperium.exception.exceptionHandlers.PlayerJoinedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/player")
public class PlayerController {

    @Autowired
    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @PostMapping
    public PlayerEntity joinPlayer(@RequestBody PlayerEntity newPlayer){
        if (playerRepository.existsByPlayerName(newPlayer.getPlayerName())) {
            throw new PlayerJoinedException("Jugador ya vinculado a la partida");
        }
        return playerRepository.save(newPlayer);
    }
}
