package com.bharath.javaassign9;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sfjkhtroiuikkkkkk";
		char ch;
		int count=0;
		Map <Character, Integer>map=new TreeMap<>();
		
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			map.put(ch, count);
		}
		for(Entry<Character, Integer> c:map.entrySet()) {
			System.out.println(c.getKey()+" "+c.getValue());
		}
		
	}

}
