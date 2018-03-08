package com.belllinfo.java02_4_2018;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String[] arryString=new String[5];
		
		for(int i=0;i<arryString.length;i++) {
			System.out.println("enter a value");
			arryString[i]=scan.next();
			
		}
		System.out.println("user provided values");
		for(int i=0; i<arryString.length;i++) {
			System.out.println(arryString[i] + " ");
		}
	}

}
