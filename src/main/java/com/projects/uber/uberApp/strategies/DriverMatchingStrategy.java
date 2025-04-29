package com.projects.uber.uberApp.strategies;

import com.projects.uber.uberApp.dto.RideRequestDto;
import com.projects.uber.uberApp.entities.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
