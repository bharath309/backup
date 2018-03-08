package com.bellinfo.java02_1_2018;

public class Intf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf3 obj1=new Intf3();
		obj1.modeOfTrans("On two tracks");
	}

}
interface Intf1{
	
	public static final int a=10;
	
	void modeOfTrans(String name);

	
}

interface Intf2{
	public static final int a=10;
	void modeOfTrans(String name);

	
}

class Intf3 implements Intf1, Intf2{

	@Override
	public void modeOfTrans(String name) {
		// TODO Auto-generated method stub
		System.out.println("Print What I whant "+name);
	}
	
}