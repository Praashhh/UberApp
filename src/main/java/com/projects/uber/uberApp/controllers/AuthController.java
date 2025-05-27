package com.projects.uber.uberApp.controllers;

import com.projects.uber.uberApp.advices.ApiResponse;
import com.projects.uber.uberApp.dto.SignupDto;
import com.projects.uber.uberApp.dto.UserDto;
import com.projects.uber.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "/signup", produces = "application/json")
    ResponseEntity<UserDto> signUp(@RequestBody SignupDto signupDto) {
        return ResponseEntity.ok(authService.signup(signupDto));
    }
}
