package com.example.class01.posts.service;

import com.example.class01.posts.domain.dto.PostResponseDto;
import com.example.class01.posts.domain.dto.PostSaveRequestDto;
import com.example.class01.posts.domain.dto.PostUpdateRequestDto;
import com.example.class01.posts.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public PostResponseDto findById(Long id) {
        return postRepository.findById(id);
    }

    @Transactional
    public void save(PostSaveRequestDto dto) {
        postRepository.save(dto);
    }

    @Transactional
    public void update(Long id, PostUpdateRequestDto dto) {
        postRepository.update(id, dto);
    }

    @Transactional
    public void delete(Long id){
        postRepository.delete(id);
    }

    public List<PostResponseDto> findAll() {
        return postRepository.findAll();
    }
}
