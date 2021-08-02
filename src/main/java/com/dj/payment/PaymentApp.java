package com.dj.payment;

import com.dj.payment.bo.CreditCardPaymentHandler;
import com.dj.payment.bo.DebitCardPaymentHandler;
import com.dj.payment.bo.UPIPaymentHandler;
import com.dj.payment.service.PaymentService;

public class PaymentApp {

	public static void main(String[] args) throws Exception {
		
		PaymentService paymentService = new PaymentService();
		
		paymentService.pay(new CreditCardPaymentHandler(), "5825-5748-9625");
		paymentService.pay(new DebitCardPaymentHandler(), "8452-7485-9632");
		paymentService.pay(new UPIPaymentHandler(), "1234568590@upi");
		
		
	}
}
