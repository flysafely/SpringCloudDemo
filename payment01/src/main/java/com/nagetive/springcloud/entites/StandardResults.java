package com.nagetive.springcloud.entites;

import lombok.*;

import java.util.Map;

@Data
@Setter
@Getter
@NoArgsConstructor
public class StandardResults<T> {
	private int code;
	private String msg;
	private T data;
	public StandardResults(int code, String msg, T data){
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
}
