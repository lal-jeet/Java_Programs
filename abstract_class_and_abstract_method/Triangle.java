package com.abstract_class_and_abstract_method;

public class Triangle extends Shape {
	double base;
	double height;
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
    
	@Override
	double getArea(){
		return 0.5*(base*height) ;
	}
	
	@Override
	void printDetails() {
		System.out.println("Type = Triangle");
		System.out.println("Length = "+base);
		System.out.println("Length = "+height);
		System.out.println("Area "+getArea());
	}

}
