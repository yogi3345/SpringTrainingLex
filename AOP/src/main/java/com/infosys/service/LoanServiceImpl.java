package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.beans.Employee;
import com.infosys.dao.LoanRepository;

@Service(value="loanService")
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
