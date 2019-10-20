package com.infosys.service;

import com.infy.beans.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee e);
	public Employee getEmployee(int empId);
}
