package com.nagetive.springcloud.CommonEntites;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
