package com.nagetive.springcloud.dao;

import com.nagetive.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentOperation {
	public int createPayment(Payment payment);
	public Payment getPaymentByID(@Param("id") int id);
}
