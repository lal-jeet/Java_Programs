package com.enum_program;

public class Manager extends Employee {

	private ManagerType type;

	
	public Manager(ManagerType type) {
		super();
		this.type = type;
	}
	
	
	Manager(){
		
	}
	
	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}

	
	@Override
	public void setSalary(double salary) {
		if(ManagerType.HR.equals(type)) {
			super.setSalary(salary+10000);
		}else {
			super.setSalary(salary+5000);
		}
		
	}
	
	
	
}
