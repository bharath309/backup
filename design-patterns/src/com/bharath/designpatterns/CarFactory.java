package com.bharath.designpatterns;

public class CarFactory {
	
	public Car getCar(String name) {
		Car car=null;
		
		if(name.equalsIgnoreCase("Tesla")) {
			car=new Tesla();
		}else if(name.equalsIgnoreCase("bmw")) {
			car=new BMW();
		}
		return car;
	}
}
