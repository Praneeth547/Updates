package com.Bridge.Ex2;

//Refined Abstractions
public class Car extends Vehicle{
	
	public Car(Engine engine) {
		super(engine);
	}
	
	@Override
    public void drive() {
        System.out.println("Driving a car with " + engine.getType());
    }

}
