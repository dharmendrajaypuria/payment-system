package com.dj.payment.service;

import com.dj.payment.exception.InvalidPaymentHandler;
import com.djlearn.payment.handler.IPaymentHandler;
import com.djlearn.payment.handler.PaymentHandler;

public class PaymentService implements IPaymentHandler{

	public void pay(PaymentHandler handler, Object obj) throws Exception {
		
		if(handler==null) {
			throw new InvalidPaymentHandler("Invalid Payment Handler");
		}
		
		handler.pay(obj);
		
	}

}
