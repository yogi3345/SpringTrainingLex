package com.infosys.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.service.EmployeeService;
import com.infosys.service.LoanService;
import com.infy.beans.Employee;

public class Client{
	
	static Test t;

	public static void main(String[] args) {
        
        //ApplicationContext container is instantiated by loading the configuration from config.xml available in application classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        //ReportService srv = (ReportService)context.getBean("reportService");
        //srv.generateReport();
        Employee e = context2.getBean("employee", Employee.class);
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        LoanService loanService = context.getBean("loanService", LoanService.class);
        //EmployeeService employeeService = context2.getBean("employeeService", EmployeeService.class);
        //LoanService loanService = context2.getBean("loanService", LoanService.class);
        employeeService.addEmployee(e);
        Employee e2 = employeeService.getEmployee(120);
        
        System.out.println(e.getEmpId());
        System.out.println(loanService.checkEligibilty(e));
    }
}