package com.example.class01.posts.repository;

import com.example.class01.posts.domain.dto.PostResponseDto;
import com.example.class01.posts.domain.dto.PostSaveRequestDto;
import com.example.class01.posts.domain.dto.PostUpdateRequestDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostRepository {

    PostResponseDto findById(Long id);

    void save(PostSaveRequestDto dto);

    void update( @Param("id") Long id, @Param("dto") PostUpdateRequestDto dto);

    void delete(Long id);

    List<PostResponseDto> findAll();

    List<PostResponseDto> findPostByPageNumber( @Param("pageSize") int pageSize, @Param("offset") long offset);

    int countPost();
}
