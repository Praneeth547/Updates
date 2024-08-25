package com.Adapter.Ex2;

public class Main {

	public static void main(String[] args) {
		 PayPal payPal = new PayPal();
	        PaymentGateway paymentGateway = new PaymentGatewayAdapter(payPal);
	        paymentGateway.processPayment(); // Output: Processing payment through PayPal...
	    }

}
