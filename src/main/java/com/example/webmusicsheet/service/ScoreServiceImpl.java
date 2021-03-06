package com.example.webmusicsheet.service;


import com.example.webmusicsheet.dto.request.ScoreRequestDTO;
import com.example.webmusicsheet.dto.response.ScoreResponseDTO;
import com.example.webmusicsheet.dto.response.ScoresResponseDTO;
import com.example.webmusicsheet.entity.Score;
import com.example.webmusicsheet.repository.ScoreRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Log4j2
public class ScoreServiceImpl implements ScoreService {

    private final ScoreRepository scoreRepository;

    @Override
    public List<ScoresResponseDTO> findAll() {
        return scoreRepository.findAll(Sort.by(Sort.Direction.DESC, "sid")).stream()
                .map(ScoresResponseDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public ScoreResponseDTO findById(Long sid) {

        Score score = scoreRepository.findById(sid).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. " + sid));

        return ScoreResponseDTO.builder()
                .entity(score)
                .build();
    }

    @Override
    public ScoreResponseDTO save(ScoreRequestDTO dto) {
        return ScoreResponseDTO.builder()
                .entity(scoreRepository.save(dto.toEntity()))
                .build();
    }

    @Override
    public ScoreResponseDTO update(Long sid, ScoreRequestDTO dto) {

        Score score = scoreRepository.findById(sid).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다." + sid));

        score.update(dto.getTitle(), dto.getNotation(), dto.getWriter());

        return ScoreResponseDTO.builder()
                .entity(scoreRepository.save(score))
                .build();
    }
}
