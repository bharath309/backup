package com.bellinfo.java02_12_2018;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address("street", "sterling", "20164");
		Hotel ht=new Hotel("highway in", 4.5, 150.25);
		TouristSpot ts=new TouristSpot("virginia", "Science", "bar");
		HolydaySpot hs=new HolydaySpot("us",ad,ht,ts);
		
		ArrayList<Object> al=new ArrayList<>();
		al.add(hs);
		for(Object oa:al) {
			System.out.println(oa.toString());
		}
		
		LinkedList<Object> ll=new LinkedList<>();
		ll.add(hs);
		for(Object oa:ll) {
			System.out.println(oa.toString());
		}
		
		HashSet<Object> hs1=new HashSet<>();
		hs1.add(hs);
		for(Object oa:hs1) {
			System.out.println(oa.toString());
		}
		
		TreeSet<Object> ts1=new TreeSet<>();
		try {
		ts1.add(hs);
		}catch(ClassCastException ts11) {
		System.out.println("exception handled");
		}
		for(Object oa:ts1) {
			System.out.println(oa.toString());
		}
		
		
		
	}

} 
class HolydaySpot{
	String country;
	Address address;
	Hotel hotel;
	TouristSpot turistspot;
	public HolydaySpot(String country, Address address, Hotel hotel, TouristSpot turistspot) {
		super();
		this.country = country;
		this.address = address;
		this.hotel = hotel;
		this.turistspot = turistspot;
	}
	@Override
	public String toString() {
		return "HolydaySpot [country=" + country + ", address=" + address + ", hotel=" + hotel + ", turistspot="
				+ turistspot + "]";
	}
	
	
	
}

class Address{
	String street;
	String city;
	String zipcode;
	public Address(String street, String city, String zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	
}
class Hotel{
	String name;
	double rating;
	double cost;
	public Hotel(String name, double rating, double cost) {
		super();
		this.name = name;
		this.rating = rating;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rating=" + rating + ", cost=" + cost + "]";
	}
	
}
class TouristSpot{
	String beachname;
	String exihibition;
	String pubname;
	public TouristSpot(String beachname, String exihibition, String pubname) {
		super();
		this.beachname = beachname;
		this.exihibition = exihibition;
		this.pubname = pubname;
	}
	@Override
	public String toString() {
		return "TouristSpot [beachname=" + beachname + ", exihibition=" + exihibition + ", pubname=" + pubname + "]";
	}
	
}