package com.enum_program;

public class Clerk extends Employee {
	int speed;
	int accuracy;
	boolean check=false;
	Clerk(int speed, int accuracy) {
		super();
		this.speed = speed;
		this.accuracy = accuracy;
	}
	
	Clerk() {
		
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	@Override
	public void setSalary(double salary) {
		
		if (getSpeed() >= 70 & getAccuracy() >=80 && check==false) {
		super.setSalary(salary+ 1000);
		check=true;
		}else {
			System.out.println("no discount");
		}
		
	}
	
	

}
