package com.Bridge.Ex1;

//Refined Abstraction 1
public class Circle extends Shape{
	public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Circle in ");
        color.applyColor();
    }
}
