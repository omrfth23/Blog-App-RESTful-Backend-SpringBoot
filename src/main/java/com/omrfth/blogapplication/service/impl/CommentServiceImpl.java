package com.omrfth.blogapplication.service.impl;

import com.omrfth.blogapplication.dto.CommentDto;
import com.omrfth.blogapplication.exception.BlogApiException;
import com.omrfth.blogapplication.exception.ResourceNotFoundException;
import com.omrfth.blogapplication.model.Comment;
import com.omrfth.blogapplication.model.Post;
import com.omrfth.blogapplication.repository.CommentRepository;
import com.omrfth.blogapplication.repository.PostRepository;
import com.omrfth.blogapplication.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final ModelMapper modelMapper;
    private final PostRepository postRepository;
    @Override
    public CommentDto createComment(CommentDto commentDto, long postId) {
        Comment comment = modelMapper.map(commentDto, Comment.class);

        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post", "id", postId));
        comment.setPost(post);

        Comment newComment = commentRepository.save(comment);

        return modelMapper.map(newComment, CommentDto.class);

    }

    @Override
    public List<CommentDto> getCommentsByPostId(long postId) {
        List<Comment> comments = commentRepository.findByPostId(postId);

        return comments.stream().map(comment -> modelMapper.map(comment, CommentDto.class)).toList();
    }

        @Override
        public CommentDto getCommentById(long commentId, long postId) {
            Comment comment = commentRepository.findByIdAndPostId(commentId, postId)
                    .orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));

            return modelMapper.map(comment, CommentDto.class);
        }


    @Override
    public CommentDto updateComment(long postId, long commentId, CommentDto updatedCommentDto) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post", "id", postId));

        Comment comment = commentRepository.findById(commentId).orElseThrow(
                () -> new ResourceNotFoundException("Comment", "id", commentId));

        if(!comment.getPost().getId().equals(post.getId())){
            throw new BlogApiException(HttpStatus.BAD_REQUEST,"This comment does not belong to this post");
        }

        modelMapper.map(updatedCommentDto, comment);

        Comment updatedCommend = commentRepository.save(comment);

        return modelMapper.map(updatedCommend, CommentDto.class);
    }

    @Override
    public void deleteComment(long postId, long commentId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post", "id", postId));

        Comment comment = commentRepository.findById(commentId).orElseThrow(
                () -> new ResourceNotFoundException("Comment", "id", commentId));

        if(!comment.getPost().getId().equals(post.getId())){
            throw new BlogApiException(HttpStatus.BAD_REQUEST, "This comment does not belong to this post");
        }
        commentRepository.delete(comment);
    }

}
