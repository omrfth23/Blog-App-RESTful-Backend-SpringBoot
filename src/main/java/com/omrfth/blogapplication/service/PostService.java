package com.omrfth.blogapplication.service;

import com.omrfth.blogapplication.dto.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts(int pageNo, int pageSize,String sortBy);

    PostDto getPostById(Long id);

    PostDto updatePost(PostDto postDto, long id);

    String deletePostById(long id);
}
