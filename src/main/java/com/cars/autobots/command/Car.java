package com.cars.autobots.command;

import org.springframework.stereotype.Component;

@Component
public class Car extends Vehicle {

	private int numOfDoors;

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
}
