package day4presentation2;

import day4presentation.Vehicle;

public class VechicleMainOutsidePackage {
	
	public static void main(String[] args) {
		Vehicle hero = new Vehicle("Xpulse", 200, 42);
		String model = hero.model;
		System.out.println("Model of Hero Vehicle= "+ model);
		System.out.println(hero.performance());
	}

}
