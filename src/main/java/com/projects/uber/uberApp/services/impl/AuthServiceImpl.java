package com.projects.uber.uberApp.services.impl;

import com.projects.uber.uberApp.dto.DriverDto;
import com.projects.uber.uberApp.dto.SignupDto;
import com.projects.uber.uberApp.dto.UserDto;
import com.projects.uber.uberApp.entities.User;
import com.projects.uber.uberApp.entities.enums.Role;
import com.projects.uber.uberApp.exceptions.RuntimeConflictException;
import com.projects.uber.uberApp.repositories.UserRepository;
import com.projects.uber.uberApp.services.AuthService;
import com.projects.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        Optional<User> user = userRepository.findByEmail(signupDto.getEmail());
        if(user.isPresent()) {
            throw new RuntimeConflictException("Cannot signup, mappedUser already exists with email "+ signupDto.getEmail());
        }

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));

        // every mappedUser is a rider by default
        User savedUser = userRepository.save(mappedUser);

        riderService.createNewRider(savedUser);

//      TODO add wallet related service

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
