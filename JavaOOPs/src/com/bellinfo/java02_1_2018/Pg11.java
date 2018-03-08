package com.bellinfo.java02_1_2018;

public class Pg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cotton obj1=new Cotton(1,"ac");
		
		
	}

}

class Cotton{
	
	Cotton() {
		System.out.println("I am Cotton constructor");
	}
	Cotton(int a, String b) {
		System.out.println("this is over loaded constructor");
	}
}
//class CottonMill extends Cotton{
//	Cotton(){
//		System.out.println("It can not be Overridded because constructor made with class name");
//	}
//}