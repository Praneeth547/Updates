package com.Observer.Ex2;

public class Subscriber implements Observer{
	private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String edition) {
        System.out.println("Hello " + name + ", the new edition of the newsletter is out: " + edition);
    }
}
