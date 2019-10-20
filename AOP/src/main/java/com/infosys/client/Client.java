package com.infosys.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.beans.Employee;
import com.infosys.service.EmployeeService;
import com.infosys.service.LoanService;

public class Client{

	public static void main(String[] args) {
        
        //ApplicationContext container is instantiated by loading the configuration from config.xml available in application classpath
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e = context2.getBean("employee", Employee.class);
        EmployeeService employeeService = (EmployeeService)context2.getBean("employeeService");
        LoanService loanService = (LoanService)context2.getBean("loanService");
        int a = employeeService.addEmployee(e);
        try {
			Employee e2 = employeeService.getEmployee(120);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
        System.out.println(e.getEmpId());
        System.out.println(loanService.checkEligibilty(e));
    }
}