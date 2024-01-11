package com.omrfth.blogapplication.service;

import com.omrfth.blogapplication.dto.LoginDto;
import com.omrfth.blogapplication.dto.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
