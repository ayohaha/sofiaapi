package com.example.sofiaapi.dao;

import com.example.sofiaapi.dto.PostsMainResponseDto;
import com.example.sofiaapi.dto.PostsSaveRequestDto;
import com.example.sofiaapi.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    int save(PostsSaveRequestDto dto);
    List<PostsMainResponseDto> findAllDesc();
    Post selectPostById(Long id);
}
