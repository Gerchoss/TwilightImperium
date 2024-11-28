package com.twilightimperiumapp.imperium.database;

import com.twilightimperiumapp.imperium.database.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
    boolean existsByPlayerName(String gameName);

    boolean existsByPlayerNameAndId(String playerName, Long id);
}
