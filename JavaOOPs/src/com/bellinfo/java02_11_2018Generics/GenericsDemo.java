package com.bellinfo.java02_11_2018Generics;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test test =new Test();
//		test.setA(10);
//		System.out.println(test.getA());

		Test<Integer> test =new Test<>();
		test.setA(10);
		System.out.println(test.getA());
		/**********************************/
		Test<String> stest =new Test<>();
		stest.setA("ABC");
		System.out.println(stest.getA());
		/*********************************/
		Test<Double> dtest =new Test<>();
		dtest.setA(15.015);
		System.out.println(dtest.getA());
		
		
	}

}

class Test<T>{
	T a;
	public void setA(T a) {
		this.a=a;
	}
	public T getA() {
		return a;
		
	}
}