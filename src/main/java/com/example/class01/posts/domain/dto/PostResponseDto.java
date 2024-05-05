package com.example.class01.posts.domain.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime modifiedDate;
}
