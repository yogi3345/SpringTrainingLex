package com.infosys.dao;

import org.springframework.stereotype.Component;

import com.infy.beans.Employee;

@Component
public interface LoanRepository {
	
	public boolean checkEligibilty(Employee e);

}
