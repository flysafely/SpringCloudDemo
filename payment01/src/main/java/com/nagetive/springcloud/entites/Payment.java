package com.nagetive.springcloud.entites;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
public class Payment {
	private int id;
	private String username;
	private double price;
	public Payment(String username,double price){
		this.username = username;
		this.price = price;
	}
}
