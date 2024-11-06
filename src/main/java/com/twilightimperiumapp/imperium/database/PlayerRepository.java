package com.twilightimperiumapp.imperium.database;

import com.twilightimperiumapp.imperium.database.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, String> {
    boolean existsByPlayerName(String gameName);
}
