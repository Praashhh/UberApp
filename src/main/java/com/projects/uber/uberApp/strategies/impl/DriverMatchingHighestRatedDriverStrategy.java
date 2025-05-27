package com.projects.uber.uberApp.strategies.impl;

import com.projects.uber.uberApp.entities.Driver;
import com.projects.uber.uberApp.entities.RideRequest;
import com.projects.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
