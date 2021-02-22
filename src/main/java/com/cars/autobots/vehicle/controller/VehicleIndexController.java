package com.cars.autobots.vehicle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleIndexController {
	
	@GetMapping("/vehicles")
	public String getIndex() {
		return "vehicleIndex";
	}
	
}
