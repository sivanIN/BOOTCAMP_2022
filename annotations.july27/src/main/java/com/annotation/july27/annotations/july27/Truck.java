package com.annotation.july27.annotations.july27;

import org.springframework.stereotype.Component;

@Component(value = "Truck")
public class Truck implements Movable {

	public void moveRight() {
		System.out.println("Move Truck Right");
		
	}

	public void moveLeft() {
		System.out.println("Move Truck Left");
		
	}

}
