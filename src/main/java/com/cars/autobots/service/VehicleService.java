package com.cars.autobots.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cars.autobots.vehicle.command.Vehicle;
import com.cars.autobots.vehicle.repo.VehicleRepository;

@Service
public class VehicleService {
	
    @Autowired
    private VehicleRepository repo;
     
    public List<Vehicle> listAll() {
        return repo.findAll();
    }
     
    public void save(Vehicle vehicle) {
        repo.save(vehicle);
    }
     
    public Vehicle get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
