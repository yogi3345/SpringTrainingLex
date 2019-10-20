package com.infosys.service;

import org.springframework.stereotype.Component;

import com.infosys.beans.Employee;

@Component
public interface EmployeeService{
	
	public int addEmployee(Employee e);
	public Employee getEmployee(int empId) throws Exception;
}
