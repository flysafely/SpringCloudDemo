package com.nagetive.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class}
)
@EnableEurekaClient
public class CustomerOrder {
  public static void main(String[] args) {
		SpringApplication.run(CustomerOrder.class, args);
  }
}
