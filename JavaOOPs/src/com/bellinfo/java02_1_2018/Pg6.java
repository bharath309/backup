package com.bellinfo.java02_1_2018;

public class Pg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz obj1=new Xyz();
		Bca obj2=new Dcb();
		obj1.name();
		obj1.myname();
		obj2.myname();
		obj2.yourName();
	}

}
interface One{
	void name();
	
}
interface Two{
	void myname();
	
}
abstract class Bca{
	abstract void myname();
	public void yourName(){
		System.out.println("printing your name and this is from concrete method");
	}
}

class Xyz implements One, Two{

	@Override
	public void myname() {
		// TODO Auto-generated method stub
		System.out.println("I am printing from Abc for Int2");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("I am printing from Abc for Int1");
	}
	
}

class Dcb extends Bca{

	@Override
	void myname() {
		// TODO Auto-generated method stub
		System.out.println("I am printing from Dcb for Bca");
	}
	
}

