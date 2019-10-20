package com.infosys.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Address {
    private String city;
    private String state;
    private int pincode;
	public String getCity() {
		return city;
	}
	//@Value("Gotham")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	//@Value("Solid")
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	//@Value("69")
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
    
    
}
