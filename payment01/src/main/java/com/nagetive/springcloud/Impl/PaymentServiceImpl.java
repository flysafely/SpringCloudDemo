package com.nagetive.springcloud.Impl;

import com.nagetive.springcloud.CommonEntites.Payment;
import com.nagetive.springcloud.dao.PaymentOperation;
import com.nagetive.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Resource
	private PaymentOperation po;

	@Override
	public int createPayment(Payment payment) {
		return po.createPayment(payment);
	}

	@Override
	public Payment getPaymentByID(int id) {
		return po.getPaymentByID(id);
	}
}
