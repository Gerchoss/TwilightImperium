package com.twilightimperiumapp.imperium.controller;

import com.twilightimperiumapp.imperium.database.GameRepository;
import com.twilightimperiumapp.imperium.database.PlayerRepository;
import com.twilightimperiumapp.imperium.database.entities.GameEntity;
import com.twilightimperiumapp.imperium.database.entities.PlayerEntity;
import com.twilightimperiumapp.imperium.exception.exceptionHandlers.*;
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

    @Autowired
    private GameRepository gameRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @PostMapping
    public PlayerEntity joinGame(@RequestBody GameEntity joinPlayer) {
        GameEntity game = gameRepository.findById(joinPlayer.getId())
                .orElseThrow(() -> new NotFoundException("La partida no existe"));

        PlayerEntity newPlayer = new PlayerEntity();
        newPlayer.setPlayerName(joinPlayer.getPlayerName());
        newPlayer.setGame(newPlayer.getGame());
        playerRepository.save(newPlayer);

        return newPlayer;
    }
}
