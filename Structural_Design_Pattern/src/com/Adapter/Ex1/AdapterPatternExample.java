package com.Adapter.Ex1;

public class AdapterPatternExample {

	public static void main(String[] args) {
		
		// Adaptee: Electric car with its own charging method
        ElectricCar myCar = new ElectricCar();

        // Adapter: Converts the charging station's power socket to USB-C
        PowerSocket adapter = new UsbToPowerSocketAdapter(myCar);

        // Client: The charging station uses the adapter to charge the car
        adapter.plugIn(); // This works because the adapter makes the interface compatible
    }

}
