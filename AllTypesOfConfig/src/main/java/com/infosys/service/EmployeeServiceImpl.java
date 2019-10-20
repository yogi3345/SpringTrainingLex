package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.infosys.dao.EmployeeRepository;
import com.infy.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	public EmployeeRepository employeeRepository;
	
	

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		employeeRepository.addEmployee(e);
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee e = employeeRepository.getEmployee(empId);
		return e;
	}

}
