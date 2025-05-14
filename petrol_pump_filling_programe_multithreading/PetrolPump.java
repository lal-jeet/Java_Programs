package com.petrol_pump_filling_programe_multithreading;

public class PetrolPump {
	public synchronized void refillCar(String carName) {
		try {
			System.out.println(carName+" started filling");
			Thread.sleep(3000);
			System.out.println(carName+" completed filling");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
