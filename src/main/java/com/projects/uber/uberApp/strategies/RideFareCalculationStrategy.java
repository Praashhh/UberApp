package com.projects.uber.uberApp.strategies;

import com.projects.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);


}
