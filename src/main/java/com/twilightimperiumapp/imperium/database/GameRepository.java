package com.twilightimperiumapp.imperium.database;

import com.twilightimperiumapp.imperium.database.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository <GameEntity, Long>{
    boolean existsByGameName(String gameName);
    Optional<GameEntity> findByGameName(String gameName);
}
