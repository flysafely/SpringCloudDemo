package com.nagetive.springcloud.controller;

import com.nagetive.springcloud.entites.Payment;
import com.nagetive.springcloud.entites.StandardResults;
import com.nagetive.springcloud.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RestController
public class MainController {

	@Resource
	private PaymentService ps;

	@PostMapping("/create")
	public StandardResults createPayment(@RequestBody Payment payment){
		int result = ps.createPayment(payment);
		if (result == 0){
			return new StandardResults(500,"failure",null);
		}else {
			return new StandardResults(200,"success",null);
		}
	}

	@GetMapping("/get/{id}")
	public StandardResults<Payment> getPaymentByID(@PathVariable("id") int id){
    System.out.println("a");
		Payment payment = ps.getPaymentByID(id);
		if (payment != null){
			return new StandardResults(200,"success",payment);
		}else {
			return new StandardResults(404,"failure",null);
		}
	}
}
