package com.bharath.designpatterns;

import java.util.Date;

public class Facade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeDemo bf=new FacadeDemo();
		bf.getHotelsFlightsAndCars(new Date(), new Date());
	}

}
