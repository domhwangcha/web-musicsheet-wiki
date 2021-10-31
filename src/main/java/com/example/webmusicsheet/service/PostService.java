package com.example.webmusicsheet.service;

import com.example.webmusicsheet.dto.request.PostRequestDTO;
import com.example.webmusicsheet.dto.response.PostResponseDTO;
import com.example.webmusicsheet.dto.response.PostsResponseDTO;

import java.util.List;

public interface PostService {

    List<PostsResponseDTO> findAll();

    PostResponseDTO save(PostRequestDTO dto);

    PostResponseDTO findById(Long sid);

    PostResponseDTO update(Long sid, PostRequestDTO dto);
}
