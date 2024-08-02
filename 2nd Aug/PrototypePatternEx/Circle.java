package com.CreationalDesignPatterns.PrototypePatternEx;

public class Circle implements Shape{
	private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    public Shape clone() {
        return new Circle(this.radius);
    }
}
