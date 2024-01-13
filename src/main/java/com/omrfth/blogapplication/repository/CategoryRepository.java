package com.omrfth.blogapplication.repository;

import com.omrfth.blogapplication.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
