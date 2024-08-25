package com.CreationalDesignPatterns.PrototypePatternEx;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		Circle originalCircle = new Circle(5);
        Circle clonedCircle = (Circle) originalCircle.clone();
        
        System.out.print("Original : ");
        originalCircle.draw();
        
        // Change the radius of the cloned circle to 10
       // clonedCircle.setRadius(10);

        System.out.print("Clone : ");
        clonedCircle.draw();
        
        Rectangle originalRectangle = new Rectangle(4, 6);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        
        originalRectangle.draw();
        clonedRectangle.draw();
    }
}
