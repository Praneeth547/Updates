package com.CreationalDesignPattern.BuilderEx1;

public class Main {
	public static void main(String[] args) {
        // Building a pizza with cheese and pepperoni using method chaining
        Pizza pizza = new Pizza.PizzaBuilder("Thin Crust", "Tomato")
                              .addCheese()
                              .addPepperoni()
                              .build();

        // Output the pizza details
        System.out.println(pizza);
    }
}
