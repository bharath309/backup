package com.bellinfo.java02_1_2018;

public class Pg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj1=new Child();
		obj1.name(12, "vegie");
		obj1.maska(7, "nonvegie");
	}

}

class Parent{
	int a=10;
	void name(int b, String vigie) {
		System.out.println("I am the parent let see in child class ");
	}
	void maska(int c,String nonvegie) {
		System.out.println("I am second method in the parent class let see in child class");
	}
}

class Child extends Parent{
	int a=20;
	@Override
	void name(int b, String vigie) {
		// TODO Auto-generated method stub
		System.out.println("I am from child for parent  methode1");
		super.name(b, vigie);
	}

	
	void krish(int c, String nonvegie) {
		// TODO Auto-generated method stub
		System.out.println("I am from child for parent  method 2");
		
	} 
	
}