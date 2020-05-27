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
	/**
	 * 单机版 可以根据一个地址找到相应的服务
	 */
//	public static final String PAYMENT_URL = "http://localhost:8001";
  /**
   * 集群版 需要修改为 在eureka中注册的微服务名称，也就是微服务yml文件中
	 * spring:
	 * 	application:
	 * 		# 会显示在eureka注册服务器列表中的名称
	 * 		name: cloud-payment-service
   */
	public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
  @Resource private RestTemplate rt;

	@GetMapping("/consumer/payment/create")
	public StandardResults createPayment(Payment payment){
		return rt.postForObject(PAYMENT_URL + "/create", payment, StandardResults.class);
	}

	@GetMapping("/consumer/payment/get/{id}")
	public StandardResults<Payment> getPayment(@PathVariable("id") int id){
		return rt.getForObject(PAYMENT_URL + "/get/" + id ,StandardResults.class);
	}
}
