package com.EmployeeSalaryCalculation;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {

		System.out.println("\t ***Salary Calculation Menu***");

		System.out.println("\t 1) FullTime Employees");
		System.out.println("\t 2) PartTime Employees ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Employee type");
		int num = sc.nextInt();

		switch (num) {
  
		case 1: {
			
			System.out.println("Enter Fulltime Employee Id :");
			int id = sc.nextInt();

			System.out.println("Enter Fulltime Employee Name :");
			String name = sc.nextLine();
			name = sc.nextLine();
			
			System.out.println("Enter Fulltime Employee Salary :");
			int salary = sc.nextInt();
			
			FullTimeEmployee e1 = new FullTimeEmployee(id,name,salary);
			System.out.println(name+" Salary is "+ e1.calculateSalary());
			
			break;
		}
		case 2:
		{
			System.out.println("Enter PartTime Employee Id :");
			int id = sc.nextInt();
			System.out.println("Enter PartTime Employee Name :");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter your hourly rate:");
			int hourlyRate = sc.nextInt();
			System.out.println("Enter your total works hour in the month :");
			int totalWork = sc.nextInt();
			
			PartTimeEmployee e2 =  new PartTimeEmployee(id,name,hourlyRate,totalWork);
			
			System.out.println("Employee total salary is :"+e2.calculateSalary());
		}
		}
		
		sc.close();

	}

}
