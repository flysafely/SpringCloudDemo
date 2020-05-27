package com.nagetive.springcloud.service;


import com.nagetive.springcloud.CommonEntites.Payment;

public interface PaymentService {
	public int createPayment(Payment payment);
	public Payment getPaymentByID(int id);
}
