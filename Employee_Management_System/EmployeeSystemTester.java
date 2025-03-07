package com.Employee_Management_System;

import java.util.Scanner;

public class EmployeeSystemTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter permanent employee Id :");
		int id =sc.nextInt();
		
		System.out.println("Enter permanent employee Name :");
		String name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter permanent employee Salary :");
		double salary = sc.nextDouble();
		
		
		
		PermanentEmployee pEmp = new PermanentEmployee(id, name, salary);
		
		if(id<= 0) {
			System.out.println("Invalid Employee Id....");
		}
		else if(name.isEmpty()) {
			System.out.println("Employee Name can't be null....");
		}
		else if(salary<=0) {
			System.out.println("Salary can't be 0 or negative....");
		}
		else {
			System.out.println(pEmp);
			pEmp.netSalary();
		}
		
		
		System.out.println("======================================");
		
		System.out.println("Enter contract employee Id :");
		int id2 =sc.nextInt();
		
		System.out.println("Enter contract employee Name :");
		String contractarName = sc.nextLine();
		contractarName =sc.nextLine();
		
		System.out.println("Enter contract employee Salary :");
		double contractarSalary = sc.nextDouble();
		
		System.out.println("Enter contract duration in year :");
		int contractDuration =sc.nextInt();
		
		ContractEmployee cEmp = new ContractEmployee(id2, contractarName, contractarSalary, contractDuration);
		
		if(id2<= 0) {
			System.out.println("Invalid contract Id....");
		}
		else if(contractarName.isEmpty()) {
			System.out.println("contract Name can't be null....");
		}
		else if(contractarSalary<=0) {
			System.out.println("Salary can't be 0 or negative....");
		}
		else if (contractDuration <=0) {
			System.out.println("Contract Duration is not 0 or nigative....");
		}
		else {
			System.out.println(cEmp);
		}
		
		
		
		sc.close();
	}

}
