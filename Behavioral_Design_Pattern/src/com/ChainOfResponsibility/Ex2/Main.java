package com.ChainOfResponsibility.Ex2;

public class Main {

	public static void main(String[] args) {
		
		// Create instances of the handlers
        PaymentHandler creditCardHandler = new CreditCardHandler();
        PaymentHandler payPalHandler = new PayPalHandler();

        // Link the handlers to form the chain
        creditCardHandler.setNext(payPalHandler); // Explanation below

        // Process payments

        // First payment using credit card
        Payment payment1 = new Payment("credit_card");
        creditCardHandler.handlePayment(payment1); // Output: Processing credit card payment

        // Second payment using PayPal
        Payment payment2 = new Payment("paypal");
        creditCardHandler.handlePayment(payment2); // Output: Processing PayPal payment

        // Third payment using an unsupported method
        Payment payment3 = new Payment("bank_transfer");
        boolean handled = creditCardHandler.handlePayment(payment3); // No handler, so no output
        if (!handled) {
            System.out.println("Payment method not supported");
        }

	}

}
