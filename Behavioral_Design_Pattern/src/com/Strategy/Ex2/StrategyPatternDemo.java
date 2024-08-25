package com.Strategy.Ex2;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		 // Use addition strategy
        Context context = new Context(new Addition());  
        System.out.println("Addition: " + context.executeStrategy(10, 5));  // Output: 15

        // Use subtraction strategy
        context = new Context(new Subtraction());  
        System.out.println("Subtraction: " + context.executeStrategy(10, 5));  // Output: 5

        // Use multiplication strategy
        context = new Context(new Multiplication());  
        System.out.println("Multiplication: " + context.executeStrategy(10, 5));  // Output: 50

	}

}
