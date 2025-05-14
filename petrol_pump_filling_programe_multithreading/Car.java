package com.petrol_pump_filling_programe_multithreading;

public class Car  implements Runnable{
    
	String name; 
	PetrolPump p;
	
	public Car(String name, PetrolPump p) {
		super();
		this.name = name;
		this.p = p;
	}

	@Override
	public void run() {
		p.refillCar(name);
		
	}
	

}
