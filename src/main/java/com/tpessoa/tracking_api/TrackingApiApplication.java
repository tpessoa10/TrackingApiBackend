package com.tpessoa.tracking_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrackingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackingApiApplication.class, args);
	}

}
