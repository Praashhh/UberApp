package com.projects.uber.uberApp.services;

import com.projects.uber.uberApp.dto.DriverDto;
import com.projects.uber.uberApp.dto.RideDto;
import com.projects.uber.uberApp.dto.RideRequestDto;
import com.projects.uber.uberApp.dto.RiderDto;
import com.projects.uber.uberApp.entities.Rider;
import com.projects.uber.uberApp.entities.User;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    RideDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

    Rider createNewRider(User user);
}
