package com.Strategy.Ex1;

public class PaymentContext {
	private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(float amount) {
        strategy.pay(amount);
    }
}
