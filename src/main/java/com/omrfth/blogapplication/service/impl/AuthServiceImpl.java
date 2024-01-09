package com.omrfth.blogapplication.service.impl;

import com.omrfth.blogapplication.dto.LoginDto;
import com.omrfth.blogapplication.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    @Override
    public String login(LoginDto loginDto) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(),loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "User Logged-in Successfully";
    }
}
