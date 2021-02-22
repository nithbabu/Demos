package com.cars.autobots.vehicle.command;

import org.springframework.stereotype.Component;

@Component
public class Bike extends Vehicle{
	
	private int maxLeanAngle;

	public int getMaxLeanAngle() {
		return maxLeanAngle;
	}

	public void setMaxLeanAngle(int maxLeanAngle) {
		this.maxLeanAngle = maxLeanAngle;
	}

}
