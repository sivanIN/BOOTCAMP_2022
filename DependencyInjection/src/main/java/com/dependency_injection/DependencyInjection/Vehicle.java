package com.dependency_injection.DependencyInjection;

public class Vehicle {
	
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
