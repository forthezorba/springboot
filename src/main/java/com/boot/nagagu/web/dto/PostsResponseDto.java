package com.boot.nagagu.web.dto;

import com.boot.nagagu.domain.posts.Posts;
import lombok.Getter;
//noargs??
@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
