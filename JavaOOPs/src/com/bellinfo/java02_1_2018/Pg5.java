package com.bellinfo.java02_1_2018;

public class Pg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj1=new Abc();
		
	}

}

class Abc{
	static {
		System.out.println("I am printing from Static block");
	}
	
	Abc(){
		System.out.println("I am printing from constructor ");
	}
	{
		System.out.println("I am printing from Instance block");
	}
}