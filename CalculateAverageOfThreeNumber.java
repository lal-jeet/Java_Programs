package com.demo1;

public class CalculateAverageOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		if(a<0 && b<0 && c<0)
		{
			System.out.println("Error");
		}
		else
		{
			int Add=a+b+c;
			int Avg = Add/3;
			System.out.println(Avg);
		}
		
		
			

	}

}
