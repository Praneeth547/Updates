package com.Observer.Ex2;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		
	// Create a newsletter
    Newsletter newsletter = new Newsletter();

    // Create subscribers
    Subscriber subscriber1 = new Subscriber("Alice");
    Subscriber subscriber2 = new Subscriber("Bob");
    Subscriber subscriber3 = new Subscriber("Charlie");

    // Register subscribers
    newsletter.registerObserver(subscriber1);
    newsletter.registerObserver(subscriber2);
    newsletter.registerObserver(subscriber3);

    // Publish a new edition of the newsletter
    newsletter.publishNewEdition("July Edition");

    // Unsubscribe Bob
    newsletter.removeObserver(subscriber2);

    // Publish another edition
    newsletter.publishNewEdition("August Edition");
	}
}
