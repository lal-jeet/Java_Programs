package com.products;

import java.util.Scanner;

//   BLC 

public class Products {
	
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Product id : ");
		productId = sc.nextInt();
		System.out.println("Enetr Product name : ");
		productName = sc.nextLine();
		productName = sc.nextLine();
		System.out.println("Enetr Product price : ");
		productPrice = sc.nextDouble();
	}
	
	public void getProductData()
	{
		System.out.println("Product id is : "+productId);
		System.out.println("Product id is : "+productName);
		System.out.println("Product id is : "+productPrice);
	}

}
