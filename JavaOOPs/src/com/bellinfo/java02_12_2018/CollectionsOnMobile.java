package com.bellinfo.java02_12_2018;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionsOnMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile("samsung", "Android", 700.00, "ATT");
		Mobile m2=new Mobile("Apple", "Ios", 800.00, "T-mobile");
		Mobile m3=new Mobile("LG", "Android", 500.00, "Verizon");
		Mobile m4=new Mobile("samsung", "Android", 500.00, "ATT");
		
		ArrayList<Mobile> al=new ArrayList<>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
			
		System.out.println("**********In Array list*******************");
		for(Mobile m:al) {
			System.out.println(m);
		}
		Collections.sort(al, new Comparator<Mobile>() {
				// created anonymous class
			@Override
			public int compare(Mobile o1, Mobile o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getCost()-o2.getCost());
			}
			
		});
		
		
		System.out.println("**********In Array list After sort*******************");
		for(Mobile m:al) {
			System.out.println(m);
		}
		System.out.println("**********In HashSet*******************");

		HashSet<Mobile> hs=new HashSet<>();
		hs.addAll(al);
		for(Mobile m:hs) {
			System.out.println(m);
		}
		System.out.println("**********In HashSet*******************");

		TreeSet<Mobile> ts=new TreeSet<>();
		ts.addAll(al);
		for(Mobile m:ts) {
			System.out.println(m);
		}
		}

}
class Mobile implements Comparable<Mobile>{
	private String brand;
	private String os;
	private double cost;
	private String network;
	
	
	public Mobile(String brand, String os, double cost, String network) {
		super();
		this.brand = brand;
		this.os = os;
		this.cost = cost;
		this.network = network;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", os=" + os + ", cost=" + cost + ", network=" + network + "]";
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}


	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		int result= this.getBrand().compareTo(o.getBrand());
		if(result==0) {
			return (int) (this.getCost()-o.getCost());
		}
		return result;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		return true;
	}
	
	
}