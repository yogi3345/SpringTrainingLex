package com.infosys.dao;

import com.infy.beans.Employee;

public interface EmployeeRepository {

	public void addEmployee(Employee e);
	public Employee getEmployee(int empId);
}
