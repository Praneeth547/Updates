package com.ChainOfResponsibility.Ex2;

public abstract class PaymentHandler {
	protected PaymentHandler next;

    // Set the next handler in the chain
    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    // Abstract method that each concrete handler must implement
    public abstract boolean handlePayment(Payment payment);
}
