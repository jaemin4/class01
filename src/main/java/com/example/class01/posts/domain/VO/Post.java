package com.example.class01.posts.domain.VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
//빈생성자
@NoArgsConstructor
//모든 필드 생성자
@AllArgsConstructor
public class Post {

    private Long id;
    private String title;
    private String contents;
    private String author;



}
