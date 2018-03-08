package com.bellinfo.java02_1_2018;

public class Audi {

	public static void main(String[] args) {
		AudiCar audi= new AudiCar();
		
		audi.energy();
		audi.modeOfTrans("road");
	}

}


interface Vehicle{
	void modeOfTrans(String name);
	void speed();
	void energy();
	void numPassengers();
}

 abstract class Car implements Vehicle{
	public void modeOfTrans(String name) {
		
		System.out.println("mode of transportaion "+name);
	}
	
}

abstract class Suv extends Car{
	 public void numPassengers(){
		System.out.println("num of passengers ");
	}
}

class AudiCar extends Suv{
	 public void energy() {
		
		System.out.println("AudiCar fuel is ");
	}
	 public void speed() {
		System.out.println("Audi car speed is ");
	}
	
	
}
