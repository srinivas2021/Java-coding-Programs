package com.user.test.sample;

public class MainCar {

	public static void main(String[] args) {
		Honda honda = new Honda();
		Toyota toyota = new Toyota();
		
		Car c1 = honda;
		Car c2 = toyota;
		
		c1.start();
		c1.run();
		
		c2.start();
		c2.run();

//		honda = c2;       //cannot convert from Car to Honda
		honda.start();
		
//		honda = toyota;    //cannot convert from Toyota to Honda
//		honda.start();

	}
}
