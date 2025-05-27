package com.projects.uber.uberApp.strategies;

import com.projects.uber.uberApp.dto.RideRequestDto;
import com.projects.uber.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    // Can be changed dynamically based on various factor like the city, traffic, time, etc
    static final double RIDE_FARE_PER_KM = 10;

    double calculateFare(RideRequest rideRequest);


}
