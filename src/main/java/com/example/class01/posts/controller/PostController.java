package com.example.class01.posts.controller;

import com.example.class01.posts.domain.dto.PostResponseDto;
import com.example.class01.posts.domain.dto.PostSaveRequestDto;
import com.example.class01.posts.domain.dto.PostUpdateRequestDto;
import com.example.class01.posts.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PostController {
    private final PostService postService;



    @GetMapping("/posts/{id}")
    public PostResponseDto findById(@PathVariable Long id){
        return postService.findById(id);
    }

    @PostMapping("/posts")
    public void save(@RequestBody PostSaveRequestDto dto){
        postService.save(dto);
    }

    @PutMapping("/posts/{id}")
    public void update (@PathVariable Long id, @RequestBody PostUpdateRequestDto dto) {
        postService.update(id, dto);
    }

    @DeleteMapping("/posts/{id}")
    public void delete(@PathVariable Long id){
        postService.delete(id);
    }


}
