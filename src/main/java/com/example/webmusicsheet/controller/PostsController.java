package com.example.webmusicsheet.controller;

import com.example.webmusicsheet.dto.request.PostRequestDTO;
import com.example.webmusicsheet.dto.response.PostResponseDTO;
import com.example.webmusicsheet.dto.response.PostsResponseDTO;
import com.example.webmusicsheet.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
@RestController
public class PostsController {

    private final PostService postService;

    @GetMapping({"", "/"})
    public List<PostsResponseDTO> getPosts() {

        return postService.findAll();

    }

    @GetMapping("/{pid}")
    public PostResponseDTO getPost(@PathVariable Long pid, Model model) {

        log.info("getScore... sid : " + pid);

        return postService.findById(pid);
    }

    @PostMapping()
    @ResponseBody
    public PostResponseDTO save(@RequestBody PostRequestDTO requestDTO) {

        log.info("save...", requestDTO.toString());

        return postService.save(requestDTO);
    }

    @PutMapping("/{pid}")
    @ResponseBody
    public PostResponseDTO update(@PathVariable Long pid, @RequestBody PostRequestDTO requestDTO) {

        log.info("update..." + requestDTO.toString());

        return postService.update(pid, requestDTO);
    }
}
