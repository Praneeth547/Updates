package com.Adapter.Ex2;

public class PayPal implements ExternalPaymentSystem{
	public void initiateTransaction() {
        System.out.println("Processing payment through PayPal...");
    }
}
