package com.petrol_pump_filling_programe_multithreading;

public class main {

	public static void main(String[] args) {
		PetrolPump p= new PetrolPump();
		Car[] car= new Car[3];
		car[0]=new Car("Ford", p);
		car[1]=new Car("Tata", p);
		car[2]=new Car("Thar", p);
		
		for(Car c:car) {
			Thread t= new Thread(c);
			t.start();
		}
	}

}
