package com.infyBoot1.FirstBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class FirstBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootAppApplication.class, args);
	}
	
	@Bean @LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	   }
}
