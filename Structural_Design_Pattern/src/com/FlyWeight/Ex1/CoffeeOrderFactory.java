package com.FlyWeight.Ex1;

import java.util.HashMap;
import java.util.Map;

public class CoffeeOrderFactory {
	private final Map<String, CoffeeOrder> flavors = new HashMap<>();

    public CoffeeOrder getCoffeeOrder(String flavor) {
        CoffeeOrder coffeeOrder = flavors.get(flavor);

        if (coffeeOrder == null) {
            coffeeOrder = new CoffeeFlavor(flavor);
            flavors.put(flavor, coffeeOrder);
        }

        return coffeeOrder;
    }
}
