package com.dj.payment.bo;

import com.djlearn.payment.handler.PaymentHandler;

public class UPIPaymentHandler implements PaymentHandler {

	public void pay(Object obj) {
		
		String message = (String) obj;
		System.out.println("Paying using UPI :: "+message);
	}

}
