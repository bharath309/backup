package com.bellinfo.java02_5_2018;

public class Assign4pg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="this is a java class";
		String words[]=word.split(" ");
		
		for(String w:words) {
		//System.out.println(w);
		System.out.println(new StringBuffer(w).reverse().toString());
		}
	}

}
