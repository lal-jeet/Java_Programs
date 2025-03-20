package com.EmployeeSalaryCalculation;

public class FullTimeEmployee extends Employee{
	protected double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		
		if(salary <= 0) {
			System.err.println("Salary can't be negative!!!");
			System.exit(0);
		}
		this.salary = salary;
	}
	
     @Override
	 public double calculateSalary() {
    	 
		 return salary;
	 }

}
