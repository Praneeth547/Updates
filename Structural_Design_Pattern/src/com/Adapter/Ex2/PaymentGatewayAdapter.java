package com.Adapter.Ex2;

public class PaymentGatewayAdapter implements PaymentGateway{
	private ExternalPaymentSystem externalPaymentSystem;

    public PaymentGatewayAdapter(ExternalPaymentSystem externalPaymentSystem) {
        this.externalPaymentSystem = externalPaymentSystem;
    }

    @Override
    public void processPayment() {
        externalPaymentSystem.initiateTransaction();
    }
}
