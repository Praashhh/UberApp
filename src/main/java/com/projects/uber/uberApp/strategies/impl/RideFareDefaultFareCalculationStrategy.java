package com.projects.uber.uberApp.strategies.impl;

import com.projects.uber.uberApp.dto.RideRequestDto;
import com.projects.uber.uberApp.entities.RideRequest;
import com.projects.uber.uberApp.services.DistanceService;
import com.projects.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Primary
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),
                rideRequest.getDropOffLocation());

        return distance * RIDE_FARE_PER_KM;
    }
}
