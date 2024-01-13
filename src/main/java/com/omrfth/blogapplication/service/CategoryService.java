package com.omrfth.blogapplication.service;

import com.omrfth.blogapplication.dto.CategoryDto;

public interface CategoryService {

    CategoryDto addCategory(CategoryDto categoryDto);

    CategoryDto getCategoryById(long id);
}
