package com.customerData;

public class Customer {
	int customerId;
	String customerNmae;
	String customerDetails;
	
	public void setCustomerData(int id , String name, String details) {
		
		customerId = id;
		customerNmae = name;
		customerDetails = details;
		
	}
	
	public void getCustomerData() {
		
		System.out.println("Customer id is :"+customerId);
		System.out.println("Customer name is :"+customerNmae);
		System.out.println("Customer details is :"+customerDetails);
		
	}

}
