package com.nagetive.springcloud.controller;

import com.nagetive.springcloud.CommonEntites.Payment;
import com.nagetive.springcloud.CommonEntites.StandardResults;
import com.nagetive.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RestController
public class MainController {

	@Resource
	private PaymentService ps;

	@Value("${server.port}")
	private String serverPort;

	@PostMapping("/create")
	public StandardResults createPayment(@RequestBody Payment payment){
		int result = ps.createPayment(payment);
		if (result == 0){
			return new StandardResults(500,"failure","端口号:" + serverPort + null);
		}else {
			return new StandardResults(200,"success","端口号:" + serverPort + null);
		}
	}

	@GetMapping("/get/{id}")
	public StandardResults<Payment> getPaymentByID(@PathVariable("id") int id){
    System.out.println("a");
		Payment payment = ps.getPaymentByID(id);
		if (payment != null){
			return new StandardResults(200,"success","端口号:" + serverPort + payment);
		}else {
			return new StandardResults(404,"failure","端口号:" + serverPort + null);
		}
	}
}
