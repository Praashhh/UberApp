package com.projects.uber.uberApp.strategies.impl;

import com.projects.uber.uberApp.dto.RideRequestDto;
import com.projects.uber.uberApp.entities.Driver;
import com.projects.uber.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
