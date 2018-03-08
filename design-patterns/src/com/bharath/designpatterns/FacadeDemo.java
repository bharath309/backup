package com.bharath.designpatterns;


import java.util.Date;
import java.util.List;

public class FacadeDemo {
HotelBooking hb=null;
FlightBooking fb=null;
CarBooking cb =null;

	
	void getHotelsFlightsAndCars(Date from,Date to) {
		hb=new HotelBooking();
		fb=new FlightBooking();
		cb=new CarBooking();
		
		List<String> hotel=hb.getHotels(new Date(), new Date());
		List<String> car=cb.getCars(new Date(), new Date());
		List<String> flight=fb.getFlights(new Date(), new Date());
		
		System.out.println(hotel);
		System.out.println(car);
		System.out.println(flight);
	}
}
