package com.Bridge.Ex2;

public class Main {

	public static void main(String[] args) {
		
		Engine electric = new ElectricEngine();
        Engine gasoline = new GasolineEngine();

        Vehicle carWithElectric = new Car(electric);
        Vehicle truckWithGasoline = new Truck(gasoline);

        carWithElectric.drive(); // Output: Driving a car with Electric
        truckWithGasoline.drive(); // Output: Driving a truck with Gasoline

	}

}
