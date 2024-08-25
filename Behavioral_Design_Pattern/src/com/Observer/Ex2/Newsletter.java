package com.Observer.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject{
	    private List<Observer> subscribers;
	    private String latestEdition;

	    public Newsletter() {
	        this.subscribers = new ArrayList<>();
	    }

	    @Override
	    public void registerObserver(Observer o) {
	        subscribers.add(o);
	    }

	    @Override
	    public void removeObserver(Observer o) {
	        subscribers.remove(o);
	    }

	    @Override
	    public void notifyObservers() {
	        for (Observer subscriber : subscribers) {
	            subscriber.update(latestEdition);
	        }
	    }

	    public void publishNewEdition(String edition) {
	        this.latestEdition = edition;
	        notifyObservers();
	    }
}
