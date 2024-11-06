package com.twilightimperiumapp.imperium.database;

import com.twilightimperiumapp.imperium.database.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <GameEntity, String>{
    boolean existsByGameName(String gameName);
}
