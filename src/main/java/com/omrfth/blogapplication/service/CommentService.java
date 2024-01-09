package com.omrfth.blogapplication.service;

import com.omrfth.blogapplication.dto.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, long postId);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentById(long commentId,long postId);

    CommentDto updateComment(long postId, long commentId, CommentDto updatedCommentDto);

    void deleteComment(long postId, long commentId);
}
