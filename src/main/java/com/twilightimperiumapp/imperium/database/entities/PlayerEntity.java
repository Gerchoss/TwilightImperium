package com.twilightimperiumapp.imperium.database.entities;



import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity(name="player")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private GameEntity game;

    @Column(name ="player_name", length = 25)
    private String playerName;

    @Column(name ="game_name", length = 50, unique = true)
    private String gameName;

}


