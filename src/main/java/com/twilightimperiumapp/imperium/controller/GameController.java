package com.twilightimperiumapp.imperium.controller;

import com.twilightimperiumapp.imperium.database.entities.GameEntity;
import com.twilightimperiumapp.imperium.database.GameRepository;
import com.twilightimperiumapp.imperium.exception.exceptionHandlers.GameNameAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/games")
public class GameController {

    @Autowired
    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @PostMapping
    public GameEntity createGame(@RequestBody GameEntity newGame){
        if (gameRepository.existsByGameName(newGame.getGameName())) {
            throw new GameNameAlreadyExistException("Ya existe una partida con el nombre ingresado");
        }
        return gameRepository.save(newGame);
    }

}
