/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infosys.irs.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.irs.exception.InvalidCredentialException;
import com.infosys.irs.model.AdminUser;
import com.infosys.irs.model.Flight;
import com.infosys.irs.model.Login;
import com.infosys.irs.model.SearchFlights;
import com.infosys.irs.model.User;
import com.infosys.irs.service.FlightService;
import com.infosys.irs.service.LoginService;

@Controller
@SessionAttributes({"userName","userId"})
public class LoginController {
	@Autowired
	private LoginService loginService;
	@Autowired
	private FlightService flightService;
	@Autowired
	private Environment environment;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLoginDetails() {
		return new ModelAndView("login", "command", new Login());
	}
	
	@RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
	public ModelAndView getAdminLoginDetails() {
		return new ModelAndView("adminLogin", "command", new Login());
	}

	@RequestMapping(value = "/authenticateLogin", method = RequestMethod.POST)
	public ModelAndView authenticateLogin(@Valid @ModelAttribute("command") Login userLogin, BindingResult result,
			ModelMap model) {		

		ModelAndView modelAndView = new ModelAndView("error");
		try {
			
			if(checkResult(modelAndView, result, userLogin)) {
				User user= loginService.authenticateLogin(userLogin);
				
				model.addAttribute("userName", user.getName());
				model.addAttribute("userId", user.getUserId());
                //Select source values from db
                List<String> s1=flightService.getSources();
                
                model.addAttribute("sourceList", s1);
                
                //Select destination values from db
                List<String> s2=flightService.getDestinations();
               
                model.addAttribute("destinationList", s2);

			modelAndView = new ModelAndView("searchFlights", "command", new SearchFlights());	
			}
		}
		catch (InvalidCredentialException e) {
			handleInvalidCredentialException(e, new String("login"), modelAndView, userLogin);
		}
		return modelAndView;

	}
	
	@RequestMapping(value = "/authenticateAdminLogin", method = RequestMethod.POST)
	public ModelAndView authenticateAdminLogin(@Valid @ModelAttribute("command") Login userLogin, BindingResult result,
			ModelMap model) {		

		ModelAndView modelAndView = new ModelAndView("error");
		try {
			
			if(checkResult(modelAndView, result, userLogin)) {
				AdminUser user= loginService.authenticateAdminLogin(userLogin);
				
				model.addAttribute("userName", user.getName());
				model.addAttribute("userId", user.getUserId());
			modelAndView = new ModelAndView("addFlight", "command", new Flight());	
			}
		}
		catch (InvalidCredentialException e) {
			handleInvalidCredentialException(e, new String("Adminlogin"), modelAndView, userLogin);
		}
		return modelAndView;

	}
	
	private void handleInvalidCredentialException(InvalidCredentialException e, String string,
			ModelAndView modelAndView, Login userLogin) {
		// TODO Auto-generated method stub
		if (e.getMessage().contains("LoginService")) {
			modelAndView = new ModelAndView("login"); 
			modelAndView.addObject(string, userLogin.getUserName());
		}

		modelAndView.addObject("message", environment.getProperty(e.getMessage()));
	}

	public boolean checkResult(ModelAndView modelAndView, BindingResult result, Login userLogin) {
		if (result.hasErrors()) {
			modelAndView= new ModelAndView("login", "command", userLogin);
			return false;
		}
		return true;
	}
	
	
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session) {
		
		ModelAndView model = new ModelAndView("infyGoHome", "", "");

		Enumeration<String> attributes = session.getAttributeNames();

		while (attributes.hasMoreElements())
			session.removeAttribute(attributes.nextElement());
		
		model.addObject("logoutMessage", environment.getProperty("LoginController.LOGOUT_SUCCESS"));
		return model;
	}
}
