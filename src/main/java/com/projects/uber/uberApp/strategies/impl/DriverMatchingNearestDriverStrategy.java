package com.projects.uber.uberApp.strategies.impl;

import com.projects.uber.uberApp.entities.Driver;
import com.projects.uber.uberApp.entities.RideRequest;
import com.projects.uber.uberApp.repositories.DriverRepository;
import com.projects.uber.uberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Primary
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenMatchingDrivers(rideRequest.getPickupLocation());
    }
}
