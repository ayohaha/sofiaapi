package com.example.sofiaapi.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    @Builder(builderMethodName = "of")
    private PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public static PostsSaveRequestDto sampleOf(String title, String content, String author) {
        return PostsSaveRequestDto.of()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}