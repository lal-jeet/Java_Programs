package com.enum_program;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Employee emp = new Employee("sdd", 244, 565);
	      Manager m1= new Manager(ManagerType.Sales);
	    Clerk cl = new Clerk(70, 80);
	    
	    m1.setSalary(2000);
	    System.out.println(m1.getSalary());
	    
	    // user will set salary and accuracy
	    cl.setAccuracy(80);
	    cl.setSalary(1000);    
	  System.out.println(cl.getSalary());
	    
	    

	}
}
