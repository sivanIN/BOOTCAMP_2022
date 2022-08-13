package com.annotation.july27.annotations.july27;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	@Autowired
	@Qualifier("Truck")
	Movable m;

	public Movable getM() {
		return m;
	}

	public void setM(Movable m) {
		this.m = m;
	}
	
	

	public Vehicle() {
	
	}

	public Vehicle(Movable m) {
	
		this.m = m;
	}
	
	public void moveVehicle() {
		m.moveLeft();
		m.moveRight();
	}
	
	

}
