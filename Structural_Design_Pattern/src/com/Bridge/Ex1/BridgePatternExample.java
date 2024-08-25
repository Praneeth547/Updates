package com.Bridge.Ex1;

public class BridgePatternExample {

	public static void main(String[] args) {
		
		// Create different color implementations
        Color red = new RedColor();
        Color green = new GreenColor();

        // Create different shapes with different colors
        Shape redCircle = new Circle(red);
        Shape greenSquare = new Square(green);

        // Draw the shapes
        redCircle.draw();    // Output: Drawing Circle in Applying red color.
        greenSquare.draw();  // Output: Drawing Square in Applying green color.
    }

}
