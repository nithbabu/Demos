package com.cars.autobots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cars.autobots.command.Vehicle;
import com.cars.autobots.service.VehicleService;

@Controller
public class GarageController {
	
	@Autowired
	VehicleService VehicleService;
	
	@GetMapping("/garage")
	public String getForm() {
		return "/createVehicle/form";
	}
	
	@PostMapping("/garage")
	public String postForm(Vehicle vehicle) {
		System.out.println("post endpoint reached");
		VehicleService.save(vehicle);
		return "vehicleIndex";
	}

}
