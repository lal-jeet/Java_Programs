package com.customerData;

public class CustomerDataWitPairameter {

	public static void main(String[] args) {
		
		Customer sonu = new Customer();
		sonu.setCustomerData(111,"Sonu","Rudhauli Basti");
		sonu.getCustomerData();
		System.out.println("========================================================");
		sonu.setCustomerData(222,"Alok","Azamgargh");
		sonu.getCustomerData();
	}

}
