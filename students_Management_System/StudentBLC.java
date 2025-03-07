package com.students_Management_System;

public class StudentBLC 
{
   int studentID ;
   String name ;
   double examfee ;
   
   
   public StudentBLC(int studentID, String name, double examfee)
   {
	super();
	this.studentID = studentID;
	this.name = name;
	this.examfee = examfee;
}

    public double payFee()
    {
    	return examfee;
    	
    }
	@Override
	public String toString() {
		return "StudentBLC [studentID=" + studentID + ", name=" + name + ", examfee=" + examfee +  "]";
	}
	
    
    
}
