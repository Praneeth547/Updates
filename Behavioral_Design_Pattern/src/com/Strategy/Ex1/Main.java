package com.Strategy.Ex1;

public class Main {

	public static void main(String[] args) {
		
		    PaymentStrategy creditCardStrategy = new CreditCardStrategy();
	        PaymentStrategy payPalStrategy = new PayPalStrategy();

	        PaymentContext paymentContext = new PaymentContext(creditCardStrategy);
	        paymentContext.pay(100.0f); // Output: Paying 100.0 using credit card

	        paymentContext = new PaymentContext(payPalStrategy);
	        paymentContext.pay(200.0f); // Output: Paying 200.0 using PayPal

	}

}
