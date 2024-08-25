package com.FlyWeight.Ex1;

public class CoffeeOrderContext {
	private final int tableNumber; // Extrinsic state

    public CoffeeOrderContext(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }
}
