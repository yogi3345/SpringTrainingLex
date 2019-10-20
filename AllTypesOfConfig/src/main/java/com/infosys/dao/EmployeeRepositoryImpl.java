package com.infosys.dao;

import org.springframework.stereotype.Component;

import com.infy.beans.Address;
import com.infy.beans.Employee;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository{

	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Employee with empID = " + e.getEmpId() + " has been added.");
	}

	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return new Employee(empId, "null", "null", "null", "null", new Address("null", "null", 0));
	}

	
}
