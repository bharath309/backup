package com.bharath.designpatterns;

public class FactoryDemo {
	public static void main(String[] args) {
		CarFactory cf=new CarFactory();
		Car car=cf.getCar("Tesla");
		car.models();
	}
}
