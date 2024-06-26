package com.example.class01.posts.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostSaveRequestDto {
    private Long id;
    private String title;
    private String contents;
    private String author;
}
