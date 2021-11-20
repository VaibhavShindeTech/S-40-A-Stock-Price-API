package com.vaibhavshindetech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class S40StockPriceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(S40StockPriceApiApplication.class, args);
	}

}
