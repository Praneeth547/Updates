package com.Observer.Ex1;

//TemperatureDisplay is an observer that displays the temperature when it gets updated.
public class TemperatureDisplay implements Observer{
	private float temperature;

	 // The method that gets called when the WeatherStation's temperature changes.
    // The new temperature is passed as an argument.
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Temperature: " + temperature);
    }
}
