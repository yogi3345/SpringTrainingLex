package com.infosys.dao;

import org.springframework.stereotype.Component;

import com.infosys.beans.Employee;

@Component
public interface EmployeeRepository {

	public void addEmployee(Employee e);
	public Employee getEmployee(int empId);
}
