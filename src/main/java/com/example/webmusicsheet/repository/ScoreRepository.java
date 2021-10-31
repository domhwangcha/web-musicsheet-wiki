package com.example.webmusicsheet.repository;


import com.example.webmusicsheet.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
