package com.projects.uber.uberApp.services.impl;

import com.projects.uber.uberApp.dto.DriverDto;
import com.projects.uber.uberApp.dto.SignupDto;
import com.projects.uber.uberApp.dto.UserDto;
import com.projects.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}