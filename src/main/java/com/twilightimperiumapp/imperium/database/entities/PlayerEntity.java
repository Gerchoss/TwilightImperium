package com.twilightimperiumapp.imperium.database.entities;

import com.twilightimperiumapp.imperium.controller.Game;
import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;


@Data
@Entity(name="player")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    //@ManyToOne
    //@JoinColumn(name = "game_id")
    private String game; //Game game

    @Column(name ="player_name", length = 25)
    private String playerName;

    @Column(name ="game_name", length = 50, unique = true)
    private String gameName;

}


