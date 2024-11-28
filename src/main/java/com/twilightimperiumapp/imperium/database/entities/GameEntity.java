package com.twilightimperiumapp.imperium.database.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity(name="game")
public class GameEntity{
    @Id
    @Column(name ="id", length = 7)
    private Long id;

    @Column(name ="player_name", length = 25)
    private String playerName;

    @Column(name ="game_name", length = 50, unique = true)
    private String gameName;


    private int players;
    private boolean expansionEnabled;
    private boolean codex1Enabled;
    private boolean codex2Enabled;
    private boolean codex3Enabled;

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY)
    private List<PlayerEntity> playersList;
}
