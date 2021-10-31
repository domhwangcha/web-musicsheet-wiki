package com.example.webmusicsheet.service;

import com.example.webmusicsheet.dto.request.ScoreRequestDTO;
import com.example.webmusicsheet.dto.response.ScoreResponseDTO;
import com.example.webmusicsheet.dto.response.ScoresResponseDTO;

import java.util.List;

public interface ScoreService {

    List<ScoresResponseDTO> findAll();

    ScoreResponseDTO save(ScoreRequestDTO dto);

    ScoreResponseDTO findById(Long sid);

    ScoreResponseDTO update(Long sid, ScoreRequestDTO dto);
}
