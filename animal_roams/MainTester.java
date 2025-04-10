package com.animal_roams;

public class MainTester {

	public static void main(String[] args) {

		Animal l = new Lion();// up casting 
		l.roam();
		getAnimal(l);
		Animal d = new Dog();
		d.roam();
		getAnimal(d);
		
		
	}
	
	public static void getAnimal(Animal a) {
		if(a instanceof Lion) {
			Lion lion = (Lion)a;//down cast
			lion.roar();
		}
		if(a instanceof Dog) {
			Dog dog = (Dog)a;//down cast
			dog.bark();
		}
	}

}
