package com.ChainOfResponsibility.Ex2;

//Handler for PayPal payments
public class PayPalHandler extends PaymentHandler{
	 @Override
	    public boolean handlePayment(Payment payment) {
	        if (payment.getMethod().equalsIgnoreCase("paypal")) {
	            System.out.println("Processing PayPal payment");
	            return true; // Payment is handled, return true
	        }
	        // If this handler can't process the payment, pass it to the next handler in the chain
	        return next != null && next.handlePayment(payment); // Explanation below
	    }
}
