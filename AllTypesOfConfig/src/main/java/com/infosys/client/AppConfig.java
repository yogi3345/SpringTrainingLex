package com.infosys.client;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.infosys.service.EmployeeService;
import com.infosys.service.LoanService;
import com.infosys.service.LoanServiceImpl;
import com.infy.beans.Address;
import com.infy.beans.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee employee() {
		return new Employee(151, "Harry", "Potter", "Manage", "Irrelevant", address());
	}
	
	@Bean
	public Address address() {
		return new com.infy.beans.Address("London", "Solid", 22);
	}
	
	/*@Bean
	public LoanRepository loanRepository() {
		ArrayList<Integer> openLoanEmployees = new ArrayList<Integer>();
		openLoanEmployees.add(150);
		openLoanEmployees.add(7);
		LoanRepositoryImpl loanRepositoryImpl = new LoanRepositoryImpl();
		loanRepositoryImpl.setOpenLoanEmployees(openLoanEmployees);
		return loanRepositoryImpl;
	}*/
	
	@Bean
	public ArrayList<Integer> openLoanEmployees() {
		ArrayList<Integer> openLoanEmployees = new ArrayList<Integer>();
		openLoanEmployees.add(150);
		openLoanEmployees.add(7);
		return openLoanEmployees;
	}

}
