package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.SignUpDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String signUp(SignUpDto signUpDto);
}
