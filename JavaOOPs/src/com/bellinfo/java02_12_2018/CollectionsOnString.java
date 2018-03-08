package com.bellinfo.java02_12_2018;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Orange");
		al.add("Apple");
		al.add("P"
				+ "ears");
		al.add("Banana");
		al.add("Pears");
		
		for (String fruits:al) {
			System.out.println(fruits);
		}
		System.out.println("**************************");
		HashSet<String> hs=new HashSet<>();
		hs.addAll(al);
		for (String fruits:hs) {
			System.out.println(fruits);
		}
	}

}
