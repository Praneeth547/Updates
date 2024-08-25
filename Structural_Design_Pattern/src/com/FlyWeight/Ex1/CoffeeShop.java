package com.FlyWeight.Ex1;

public class CoffeeShop {
	public static void main(String[] args) {
        CoffeeOrderFactory coffeeOrderFactory = new CoffeeOrderFactory();

        // Orders with intrinsic state (coffee flavor) and extrinsic state (table number)
        CoffeeOrder order1 = coffeeOrderFactory.getCoffeeOrder("Cappuccino");
        order1.serveCoffee(new CoffeeOrderContext(1));

        CoffeeOrder order2 = coffeeOrderFactory.getCoffeeOrder("Espresso");
        order2.serveCoffee(new CoffeeOrderContext(2));

        CoffeeOrder order3 = coffeeOrderFactory.getCoffeeOrder("Cappuccino");
        order3.serveCoffee(new CoffeeOrderContext(3));

        // The flavor "Cappuccino" is shared between order1 and order3
        // It reduces memory usage as the intrinsic state is shared among orders with the same flavor
    }
}
