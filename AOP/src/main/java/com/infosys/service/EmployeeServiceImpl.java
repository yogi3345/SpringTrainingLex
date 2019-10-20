package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.beans.Employee;
import com.infosys.dao.EmployeeRepository;

@Service(value="employeeService")
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
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		employeeRepository.addEmployee(e);
		return e.getEmpId();
	}

	@Override
	public Employee getEmployee(int empId) throws Exception{
		// TODO Auto-generated method stub
		Employee e = employeeRepository.getEmployee(empId);
		/*if(true)
			throw new RuntimeException("yay");
		System.out.println("Yes");*/
		return e;
	}

}
