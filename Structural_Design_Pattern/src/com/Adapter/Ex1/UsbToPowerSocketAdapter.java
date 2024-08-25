package com.Adapter.Ex1;

//Adapter class that implements the target interface and uses the adaptee
public class UsbToPowerSocketAdapter implements PowerSocket{
	private ElectricCar electricCar;

    public UsbToPowerSocketAdapter(ElectricCar electricCar) {
        this.electricCar = electricCar;
    }

    @Override
    public void plugIn() {
        // Here, the adapter translates the plugIn() request to the chargeWithUsbC() call
        electricCar.chargeWithUsbC();
    }
}
