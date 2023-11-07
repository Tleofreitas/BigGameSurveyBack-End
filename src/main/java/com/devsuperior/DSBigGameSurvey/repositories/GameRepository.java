package com.devsuperior.DSBigGameSurvey.repositories;

import com.devsuperior.DSBigGameSurvey.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
