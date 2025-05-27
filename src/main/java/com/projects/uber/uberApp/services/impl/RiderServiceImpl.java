package com.projects.uber.uberApp.services.impl;


import com.projects.uber.uberApp.dto.RideDto;
import com.projects.uber.uberApp.dto.RideRequestDto;
import com.projects.uber.uberApp.dto.RiderDto;
import com.projects.uber.uberApp.entities.RideRequest;
import com.projects.uber.uberApp.entities.Rider;
import com.projects.uber.uberApp.entities.User;
import com.projects.uber.uberApp.entities.enums.RideRequestStatus;
import com.projects.uber.uberApp.repositories.RideRepository;
import com.projects.uber.uberApp.repositories.RideRequestRepository;
import com.projects.uber.uberApp.repositories.RiderRepository;
import com.projects.uber.uberApp.services.RiderService;
import com.projects.uber.uberApp.strategies.DriverMatchingStrategy;
import com.projects.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        // Calculate the fare
        Double fare = rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);
        driverMatchingStrategy.findMatchingDriver(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }

    // Onboard a new rider
    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider.
                builder().
                user(user).
                rating(0.0)
                .build();

        return riderRepository.save(rider);
    }
}
