package com.Employee_Management_System;

public class PermanentEmployee extends Employee {
       double providentfund;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
		this.providentfund = this.employeeSalary*0.12;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentfund=" + providentfund + "]";
	}

	public void netSalary() {
		System.out.println("netSalary is :"+ (employeeSalary + providentfund) );
	}
	
	
       
}
