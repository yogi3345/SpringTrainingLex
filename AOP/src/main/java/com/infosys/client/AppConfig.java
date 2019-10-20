package com.infosys.client;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.infosys.beans.Address;
import com.infosys.beans.Employee;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.infosys")
public class AppConfig {
	
	@Bean
	public Employee employee() {
		return new Employee(151, "Harry", "Potter", "Manage", "Irrelevant", address());
	}
	
	@Bean
	public Address address() {
		return new com.infosys.beans.Address("London", "Solid", 22);
	}
	
	@Bean
	public ArrayList<Integer> openLoanEmployees() {
		ArrayList<Integer> openLoanEmployees = new ArrayList<Integer>();
		openLoanEmployees.add(150);
		openLoanEmployees.add(7);
		return openLoanEmployees;
	}

}
