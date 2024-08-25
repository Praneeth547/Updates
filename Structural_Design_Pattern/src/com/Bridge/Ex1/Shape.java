package com.Bridge.Ex1;

//Abstraction
public abstract class Shape {
	 protected Color color; // Bridge to the Implementor

	    protected Shape(Color color) {
	        this.color = color;
	    }

	    abstract void draw();
}
