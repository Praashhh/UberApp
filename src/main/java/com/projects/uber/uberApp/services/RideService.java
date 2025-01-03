package com.projects.uber.uberApp.services;

import com.projects.uber.uberApp.dto.DriverDto;
import com.projects.uber.uberApp.dto.RideRequestDto;
import com.projects.uber.uberApp.entities.Ride;
import com.projects.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, DriverDto driverDto);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);


}
