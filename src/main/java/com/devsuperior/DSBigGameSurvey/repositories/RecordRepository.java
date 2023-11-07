package com.devsuperior.DSBigGameSurvey.repositories;

import com.devsuperior.DSBigGameSurvey.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
