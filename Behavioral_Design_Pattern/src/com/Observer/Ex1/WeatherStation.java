package com.Observer.Ex1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
	private List<Observer> observers;
    private float temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all registered observers of a change in the temperature.
    @Override
    public void notifyObservers() {
    	// Iterate through the list of observers and call their update method.
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    // Method to set the new temperature.
    // This method is also responsible for notifying observers of the temperature change.
    public void setTemperature(float temperature) {
        this.temperature = temperature; // Update the temperature.
        notifyObservers(); // Notify all observers of the new temperature.
    }
}
