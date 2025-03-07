package com.students_Management_System;

import java.util.Scanner;

public class Tester 
{
    public static void main(String[] args) 
  {
    	Scanner sc =new Scanner(System.in);
    	System.out.println(" Enter your fee payment vlaue : ");
    	double value=sc.nextDouble();
     	   sc.close();     
   	DayScholarBLC d1=new DayScholarBLC(13, "brian lara ", 25000, 15000);
    	
    	System.out.println(d1); 
    	
    	System.out.println(d1.payfee(value));
    	
    	   double total1=d1.examfee+d1.transportFee;
    	   if(value<total1)
       	{    
       		total1-=value;
       		System.out.println("that much of amount you need to pay "+(total1));
       		
       	}
       	else if (value>total1)
       	{
       		total1-=value;
       		System.out.println("that much amount you paid extra "+total1);
       	}
    	
    	System.out.println("---------------------------------------------");
    	
    	HostellerBLC h1=new HostellerBLC(12, "john smith", 45000, 15000);
    	System.out.println(h1);
    	System.out.println(h1.payfee(value));
    	
    	double total =h1.examfee+h1.hostelFee;
    	
    	if(value<total)
    	{    
    		total-=value;
    		System.out.println("that much of amount you need to pay "+(total));
    		
    	}
    	else if (value>total)
    	{
    		total-=value;
    		System.out.println("that much amount you paid extra "+total);
    	}
    	 
	
}
}
