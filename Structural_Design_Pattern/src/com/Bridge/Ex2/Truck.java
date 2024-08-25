package com.Bridge.Ex2;

public class Truck extends Vehicle{
	public Truck(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Driving a truck with " + engine.getType());
    }
}
