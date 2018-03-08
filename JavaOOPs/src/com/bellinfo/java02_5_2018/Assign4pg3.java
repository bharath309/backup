package com.bellinfo.java02_5_2018;

public class Assign4pg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" This b is a Java t class a";
		String[] arry = s.split(" ");
		for(int i=0;i<arry.length;i++) {
			String wrd = arry[i];
			if(wrd.length()==1) {
				System.out.println(wrd);
			}
		}
		/*
		int c=0;
		for(int i=0;i<s.length()-2;i++) {
//			if((((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))&&(s.charAt(i+2)==' '))&&
//					((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))|| 
//					((s.charAt(i)!=' ')&&(s.charAt(i+1)==' '))) {
			
			if((((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))&&(s.charAt(i+2)==' ')&&(s.lastIndexOf(i)!=' '))) {
			
			
				c++;
			}
		}
		System.out.println(c);
*/		
	}

}
