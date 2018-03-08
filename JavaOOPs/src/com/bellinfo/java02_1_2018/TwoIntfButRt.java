package com.bellinfo.java02_1_2018;

public class TwoIntfButRt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Int3 obj1=new Int3();
		obj1.modeOfTrans("On two tracks");
	}

}
interface Int1{
	
	String modeOfTrans(String name);

	
}

interface Int2{
	
	int modeOfTrans();

	
}

class Int3 implements Int1, Int2{

	
	@Override
	public int modeOfTrans() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String modeOfTrans(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}