package com.Bridge.Ex1;

//Refined Abstraction 2
public class Square extends Shape{
	public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Square in ");
        color.applyColor();
    }
}
