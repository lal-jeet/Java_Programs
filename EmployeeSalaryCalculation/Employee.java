package com.EmployeeSalaryCalculation;

public class Employee {
	
	protected int id;
	protected String name;
	
	public Employee(int id, String name) {
		super();
		
		
		if(id<= 0) {
			System.err.println("ID can not be zero ");
			System.exit(0);
		}
		this.id = id;
		this.name = name;
		
	}
	
	public double calculateSalary() {
       
		return 0.0;
	}

}
