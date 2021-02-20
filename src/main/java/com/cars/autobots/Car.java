package com.cars.autobots;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.SocketUtils;

@Component
@Scope("prototype")
public class Car {
	
	private String carName;
	private int doorNum;
	private int wheelNum;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getDoorNum() {
		return doorNum;
	}
	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}
	public int getWheelNum() {
		return wheelNum;
	}
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}
	
	public void show() {
		System.out.println("Finally inside Car");
	}


}
