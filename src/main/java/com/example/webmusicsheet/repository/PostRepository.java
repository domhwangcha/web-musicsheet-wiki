package com.example.webmusicsheet.repository;

import com.example.webmusicsheet.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
