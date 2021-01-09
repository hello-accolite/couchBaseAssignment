package com.example.au.couchbasedemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import net.bytebuddy.asm.Advice.Return;

@Document
public class Employee {
	
	@Id
	private String empId;
	private String empName;
	private String address;
	private String pin;
	private String location;
	public Employee(String empId, String empName, String address,String pin,String location) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.pin=pin;
		this.location=location;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getPin() {
		return pin; 
	}
	public void setPin(String pin) {
		this.pin=pin;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String hetLocation() {
		return location;
	}
	

}
