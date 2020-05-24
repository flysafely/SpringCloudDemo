package com.nagetive.springcloud.CommonEntites;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
public class Payment {
	private int id;
	private String username;
	private double price;
	public Payment(String username, double price){
		this.username = username;
		this.price = price;
	}
}
