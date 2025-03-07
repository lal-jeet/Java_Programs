package com.Employee_Management_System;

public class ContractEmployee extends Employee {
          
	       int contractDuration;

		public ContractEmployee(int employeeId, String employeeName, double employeeSalary, int contractDuration) {
			super(employeeId, employeeName, employeeSalary);
			this.contractDuration = contractDuration;
		}

		@Override
		public String toString() {
			return "ContractEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + ", contractDuration=" + contractDuration + "years]";
		}
	       
		
		
}
