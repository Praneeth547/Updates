package com.CreationalDesignPatterns.PrototypePatternEx;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		Circle originalCircle = new Circle(5);
        Circle clonedCircle = (Circle) originalCircle.clone();
        
        Rectangle originalRectangle = new Rectangle(4, 6);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        System.out.print("Original : ");
        originalCircle.draw();
        System.out.print("Clone : ");
        clonedCircle.draw();
        
        originalRectangle.draw();
        clonedRectangle.draw();
    }
}
