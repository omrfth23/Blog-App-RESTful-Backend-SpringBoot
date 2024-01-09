package com.omrfth.blogapplication.service;

import com.omrfth.blogapplication.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
