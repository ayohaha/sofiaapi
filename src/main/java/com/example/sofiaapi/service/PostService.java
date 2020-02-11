package com.example.sofiaapi.service;

import com.example.sofiaapi.dao.PostMapper;
import com.example.sofiaapi.dto.PostsMainResponseDto;
import com.example.sofiaapi.dto.PostsSaveRequestDto;
import com.example.sofiaapi.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PostService {
    @Autowired
    PostMapper postMapper;

    public int save(PostsSaveRequestDto dto){
        return postMapper.save(dto);
    }
    public List<PostsMainResponseDto> findAllDesc(){
        return postMapper.findAllDesc();
    }
    public Post selectPostById(Long id){
        return postMapper.selectPostById(id);
    }
}
