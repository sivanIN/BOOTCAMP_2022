package com.annotation.july27.annotations.july27;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Movable {

	public void moveRight() {
		System.out.println("Move car  to right");
		
	}

	public void moveLeft() {
		System.out.println("Move car  to left");
		
	}

}
