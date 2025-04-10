package com.abstract_class_and_abstract_method;

public class Circle extends Shape {
	double radius;
	
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double getArea(){
		return 2*(radius*radius);
	}
	
	@Override
	void printDetails() {
		System.out.println("Type = Circle");
		System.out.println("Length = "+radius);
		System.out.println("Area "+getArea());
	}

}
