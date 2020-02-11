package com.example.sofiaapi.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("post")
public class Post {
    private Long id;
    private String title;
    private String content;
    private String author;

    public Post(){

    }

    public Post(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
