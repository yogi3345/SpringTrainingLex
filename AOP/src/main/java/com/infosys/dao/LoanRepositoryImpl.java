package com.infosys.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infosys.beans.Employee;

@Repository(value="loanRepository")
public class LoanRepositoryImpl implements LoanRepository{
	ArrayList<Integer> openLoanEmployees;
	
	

	public ArrayList<Integer> getOpenLoanEmployees() {
		return openLoanEmployees;
	}


	@Autowired
	public void setOpenLoanEmployees(ArrayList<Integer> openLoanEmployees) {
		this.openLoanEmployees = openLoanEmployees;
	}



	public boolean checkEligibilty(Employee e) {
		// TODO Auto-generated method stub
		if(e.getRole().equals("Manager") || e.getRole().equals("GM"))
			return false;
		for(int i:openLoanEmployees) {
			if(i==e.getEmpId())
				return false;
		}
		return true;
	}
	
}
