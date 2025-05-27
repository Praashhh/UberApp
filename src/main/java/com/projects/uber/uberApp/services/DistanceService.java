package com.projects.uber.uberApp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    // TODO Call the third party api called OSRM to fetch the distance
    double calculateDistance(Point src, Point dest);
}
