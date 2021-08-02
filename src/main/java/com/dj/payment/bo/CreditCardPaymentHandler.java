package com.dj.payment.bo;

import com.djlearn.payment.handler.PaymentHandler;

public class CreditCardPaymentHandler implements PaymentHandler {

	public void pay(Object obj) {
		
		String message = (String) obj;
		System.out.println("Paying using credit card :: "+message);
	}

}
