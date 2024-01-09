package com.omrfth.blogapplication.repository;

import com.omrfth.blogapplication.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
