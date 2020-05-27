package com.nagetive.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRun7001 {
	public static void main(String[] args){
		SpringApplication.run(EurekaRun7001.class, args);
	}
}
