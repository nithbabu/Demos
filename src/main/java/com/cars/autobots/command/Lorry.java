package com.cars.autobots.vehicle.command;

import org.springframework.stereotype.Component;

@Component
public class Lorry extends Vehicle {
	
	private int numOfDoors;
	
	private int carryingCapacity;

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}

}
