package com.Observer.Ex1;

public class Main {

	public static void main(String[] args) {
		
		WeatherStation weatherStation = new WeatherStation();
		
		// Create observers.
        TemperatureDisplay display1 = new TemperatureDisplay();
       // TemperatureDisplay display2 = new TemperatureDisplay();

        // Register the observers with the WeatherStation.
        weatherStation.registerObserver(display1);
      // weatherStation.registerObserver(display2);

        // Set the temperature in the WeatherStation.
        // This will trigger a notification to all registered observers.
        weatherStation.setTemperature(25.5f);

       
        // Changing the temperature again to see the update in action.
        weatherStation.setTemperature(30.0f);
	}

}
