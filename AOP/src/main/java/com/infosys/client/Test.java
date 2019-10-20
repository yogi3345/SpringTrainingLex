package com.infosys.client;

import org.springframework.beans.factory.annotation.Autowired;

import com.infosys.service.EmployeeService;

public class Test {
	
	public EmployeeService employeeService;

	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
}
