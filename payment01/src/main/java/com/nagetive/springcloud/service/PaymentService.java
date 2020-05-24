package com.nagetive.springcloud.service;

import com.nagetive.springcloud.entites.Payment;

public interface PaymentService {
	public int createPayment(Payment payment);
	public Payment getPaymentByID(int id);
}
