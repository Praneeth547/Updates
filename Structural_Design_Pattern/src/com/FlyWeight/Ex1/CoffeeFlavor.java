package com.FlyWeight.Ex1;

public class CoffeeFlavor implements CoffeeOrder {
	private final String flavor; // Intrinsic state

    public CoffeeFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serveCoffee(CoffeeOrderContext context) {
        System.out.println("Serving coffee flavor " + flavor + " to table " + context.getTableNumber());
    }
}
