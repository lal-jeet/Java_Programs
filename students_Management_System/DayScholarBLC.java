package com.students_Management_System;

public class DayScholarBLC extends StudentBLC
{
  
        double transportFee ;

		public DayScholarBLC(int studentID, String name, double examfee, double transportFee) 
		{
			super(studentID, name, examfee);
			this.transportFee = transportFee;
		}

		@Override
		public String toString() {
			return super.toString()+"DayScholarBLC [transportFee=" + transportFee + "]";
		}

		public double  payfee(double amount)
	      {
	    	  double totalfee=examfee+transportFee;
	    	  
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