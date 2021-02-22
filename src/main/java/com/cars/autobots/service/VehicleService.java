package com.cars.autobots.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.autobots.command.Vehicle;
import com.cars.autobots.repo.VehicleRepository;

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
