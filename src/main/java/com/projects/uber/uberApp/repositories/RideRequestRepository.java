package com.projects.uber.uberApp.repositories;

import com.projects.uber.uberApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}
