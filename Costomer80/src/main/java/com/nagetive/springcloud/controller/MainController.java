package com.nagetive.springcloud.controller;

import com.nagetive.springcloud.CommonEntites.Payment;
import com.nagetive.springcloud.CommonEntites.StandardResults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class MainController {
	public static final String PAYMENT_URL = "http://localhost:8001";

	@Resource
	private RestTemplate rt;

	@GetMapping("/consumer/payment/create")
	public StandardResults createPayment(Payment payment){
		return rt.postForObject(PAYMENT_URL + "/create", payment, StandardResults.class);
	}

	@GetMapping("/consumer/payment/get/{id}")
	public StandardResults<Payment> getPayment(@PathVariable("id") int id){
		return rt.getForObject(PAYMENT_URL + "/get/" + id ,StandardResults.class);
	}
}
