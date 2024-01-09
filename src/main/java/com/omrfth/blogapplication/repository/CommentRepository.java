package com.omrfth.blogapplication.repository;

import com.omrfth.blogapplication.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(Long postId);

    Optional<Comment> findByIdAndPostId(Long commentId, Long postId);
}
