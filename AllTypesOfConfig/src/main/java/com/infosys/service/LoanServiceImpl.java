package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.infosys.dao.LoanRepository;
import com.infy.beans.Employee;

public class LoanServiceImpl implements LoanService {
	
	LoanRepository loanRepository;
	
	/*public LoanServiceImpl() {
	}

	public LoanServiceImpl(LoanRepository loanRepository) {
		super();
		this.loanRepository = loanRepository;
	}*/

	public LoanRepository getLoanRepository() {
		return loanRepository;
	}
	
	@Autowired
	public void setLoanRepository(LoanRepository loanRepository) {
		this.loanRepository = loanRepository;
	}

	@Override
	public boolean checkEligibilty(Employee e) {
		// TODO Auto-generated method stub
		return loanRepository.checkEligibilty(e);
	}

}
