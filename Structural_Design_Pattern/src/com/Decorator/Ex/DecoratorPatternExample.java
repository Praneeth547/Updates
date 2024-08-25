package com.Decorator.Ex;

public class DecoratorPatternExample {

	public static void main(String[] args) {
		
		 // Simple Coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

        // Add Milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

        // Add Sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

        // Add Whipped Cream
        myCoffee = new WhippedCreamDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.getCost());

	}

}
