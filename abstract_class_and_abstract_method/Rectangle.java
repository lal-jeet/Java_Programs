package com.abstract_class_and_abstract_method;

public class Rectangle extends Shape {
	double length;
	double breadth;
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	double getArea(){
		return length*breadth;
	}
	
	@Override
	void printDetails() {
		System.out.println("Type = Rectangle");
		System.out.println("Length = "+length);
		System.out.println("Breadth = "+breadth);
		System.out.println("Area "+getArea());
	}
       
}
