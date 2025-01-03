package com.projects.uber.uberApp.services;

import com.projects.uber.uberApp.dto.DriverDto;
import com.projects.uber.uberApp.dto.SignupDto;
import com.projects.uber.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);



}
