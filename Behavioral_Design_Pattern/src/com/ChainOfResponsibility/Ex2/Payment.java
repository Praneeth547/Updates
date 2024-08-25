package com.ChainOfResponsibility.Ex2;

public class Payment {
	private String method;

    public Payment(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
