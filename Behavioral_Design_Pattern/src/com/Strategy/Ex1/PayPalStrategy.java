package com.Strategy.Ex1;

public class PayPalStrategy implements PaymentStrategy{
	@Override
    public void pay(float amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
