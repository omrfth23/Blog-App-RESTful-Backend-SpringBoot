package com.omrfth.blogapplication.service;

import com.omrfth.blogapplication.dto.CategoryDto;
import com.omrfth.blogapplication.dto.PostDto;

import java.util.List;

public interface CategoryService {

    CategoryDto addCategory(CategoryDto categoryDto);

    CategoryDto getCategoryById(long id);

    List<CategoryDto> getAllCategories();

    CategoryDto updateCategory(long id, CategoryDto categoryDto);

    String deleteCategory(long id);

}
