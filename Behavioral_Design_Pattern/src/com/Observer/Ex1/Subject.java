package com.Observer.Ex1;

public interface Subject {
	void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
