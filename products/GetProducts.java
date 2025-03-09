package com.products;

// ELC

public class GetProducts {

	public static void main(String[] args) {
		Products car = new Products();
		
		System.out.println("=======================enter first product details========================");
		car.setProductData();
		car.getProductData();
		System.out.println("=======================enter second product details========================");	
		car.setProductData();
		car.getProductData();
		System.out.println("=======================enter second product details========================");	
		car.setProductData();
		car.getProductData();
		
	}

}
