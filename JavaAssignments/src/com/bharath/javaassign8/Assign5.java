package com.bharath.javaassign8;

import java.util.HashMap;
import java.util.TreeMap;

public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(25, "Bharath");
		hm.put(50,"Ramesh");
		hm.put(75,"Ashish");
		System.out.println(hm);
		System.out.println(hm.containsKey(15));
		System.out.println(hm.containsValue("Ramesh"));

		TreeMap<Integer, String> tm=new TreeMap<>();
		tm.putAll(hm);
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey()); 
	}

}
