package com.cars.autobots.vehicle.repo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cars.autobots.vehicle.command.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}