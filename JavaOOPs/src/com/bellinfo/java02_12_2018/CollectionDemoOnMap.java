package com.bellinfo.java02_12_2018;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemoOnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "Orange");
		hm.put(2, "Apple");
		hm.put(3, "Pears");
		hm.put(4, "Banana");
		Set<Integer>hs=hm.keySet();
		for(Integer i:hs) {
			System.out.println(i+" "+hm.get(i));
		}
		
		System.out.println(" Using EntrySet");
		for(Map.Entry<Integer, String> entry:hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

}
