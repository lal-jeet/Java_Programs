package com.students_Management_System;

public class HostellerBLC extends StudentBLC
{
    
	public HostellerBLC(int studentID, String name, double examfee, double hostelFee) 
	{
		super(studentID, name, examfee);
		this.hostelFee = hostelFee;
	}

	double hostelFee ;

	 @Override
	public String toString() {
		return super.toString()+"HostellerBLC [hostelFee=" + hostelFee + "]";
	}

	public double  payfee(double amount)
      {
    	  double totalfee=hostelFee+examfee;
    	 
    	  if(amount<totalfee)
    	  {
    		  totalfee-=amount ;
    		  return totalfee ;
    	  }
    	  else if(totalfee<amount)
    	  {
    		 totalfee-=amount ;
    		 return totalfee ;
    	  }
    	  else
    	  {
    		  return 0;
    	  }
      }
}