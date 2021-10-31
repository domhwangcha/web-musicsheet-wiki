package com.example.webmusicsheet.dto.request;

import com.example.webmusicsheet.entity.Post;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostRequestDTO {

    private String title;
    private String content;
    private String writer;

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .build();
    }
}
