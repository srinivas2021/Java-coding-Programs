package com.user.test.sample;

public class Toyota extends Car {

	public void start() {
		System.out.println("Start the Toyota car");
	}
	
	@Override
	public void run() {
		System.out.println("Run the Toyota the car");
	}
}
