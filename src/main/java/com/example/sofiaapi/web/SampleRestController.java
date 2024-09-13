package com.example.sofiaapi.web;

import com.example.sofiaapi.dto.PostsMainResponseDto;
import com.example.sofiaapi.dto.PostsSaveRequestDto;
import com.example.sofiaapi.service.PostService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@AllArgsConstructor
public class SampleRestController {

    private PostService postService;



    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public int savePosts(@RequestBody PostsSaveRequestDto dto) {
        return postService.save(PostsSaveRequestDto.sampleOf(dto.getTitle(), dto.getContent(), dto.getAuthor()));
    }

    @GetMapping("/lists")
    public List<PostsMainResponseDto> findAllDesc(){
        return postService.findAllDesc();
    }
}
