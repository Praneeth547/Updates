package com.ChainOfResponsibility.Ex2;

//Handler for Credit Card payments
public class CreditCardHandler extends PaymentHandler{
	  @Override
	    public boolean handlePayment(Payment payment) {
	        if (payment.getMethod().equalsIgnoreCase("credit_card")) {
	            System.out.println("Processing credit card payment");
	            return true; // Payment is handled, return true
	        }
	        // If this handler can't process the payment, pass it to the next handler in the chain
	        return next != null && next.handlePayment(payment); 
	    }
}
