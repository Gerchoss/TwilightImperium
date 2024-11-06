package com.twilightimperiumapp.imperium.database.entities;

import com.twilightimperiumapp.imperium.controller.Game;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity(name="game")
public class GameEntity extends Game {
    @Id
    @Column(name ="id", length = 7)
    private String id;

    @Column(name ="player_name", length = 25)
    private String playerName;

    @Column(name ="game_name", length = 50, unique = true)
    private String gameName;


    private int players;
    private boolean expansionEnabled;
    private boolean codex1Enabled;
    private boolean codex2Enabled;
    private boolean codex3Enabled;
}
