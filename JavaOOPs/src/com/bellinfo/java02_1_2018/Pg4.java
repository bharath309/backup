package com.bellinfo.java02_1_2018;

public class Pg4 {
	static {
		System.out.println("main static");
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Seqence obj1=new Bcd();
		obj1.abc();
	}

}
abstract class Seqence{
	
	{
		System.out.println("my comment in instance block");
	}
	abstract void abc();
	static {
		System.out.println("My comment in Static block");
	}
}
class Bcd extends Seqence{

	@Override
	void abc() {
		
		System.out.println("1234");
	}
	
}