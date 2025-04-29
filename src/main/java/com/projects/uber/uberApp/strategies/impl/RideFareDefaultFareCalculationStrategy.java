package com.projects.uber.uberApp.strategies.impl;

import com.projects.uber.uberApp.dto.RideRequestDto;
import com.projects.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
