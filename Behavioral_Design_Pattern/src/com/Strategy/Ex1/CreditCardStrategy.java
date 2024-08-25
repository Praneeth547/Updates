package com.Strategy.Ex1;

public class CreditCardStrategy implements PaymentStrategy{
	@Override
    public void pay(float amount) {
        System.out.println("Paying " + amount + " using credit card");
    }
}
