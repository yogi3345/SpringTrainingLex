package com.infyBoot1.FirstBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootAppApplication.class, args);
	}

}
