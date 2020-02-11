package com.example.sofiaapi.service;



import com.example.sofiaapi.dto.PostsMainResponseDto;
import com.example.sofiaapi.dto.PostsSaveRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Slf4j
@SpringBootTest
@Transactional
public class PostServiceTest {
    @Autowired
    PostService postService;

    @Test
    public void save(PostsSaveRequestDto dto){
        int result = postService.save(dto);
        System.out.println("post : {}" + result);
    }

    @Test
    public void findAllDesc(){
        List<PostsMainResponseDto> posts =  postService.findAllDesc();
        System.out.println("post : {}" + posts.toString());
    }



}
