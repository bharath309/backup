package com.bellinfo.java02_1_2018;

public class Pg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

public class Cat{
	// Illegal modifier for the class Cat; only public, abstract & final are permitted
	//	public must be defined in its own file 
	// private is not accepting
	// protected is also not accepting 
	// but default class is accepting.  
}

class Lion{
	public int a;
	private int b;
	protected int c;
	
	public void cat(){
		System.out.println("Let see future and this is public cat method ");
	}
	private void animal() {
		System.out.println("this is private animal method");
	}
	protected void sand() {
		System.out.println("this is protected sand method");
	}
	void mud() {
		System.out.println("this is default method");
	}
}

class Dog extends Lion {
	public int a;
	private int b;
	protected int c;
	 public void cat() {
		System.out.println("this overrided method");
		// Lion class public cat method to cat method. error showing like Cannot reduce the visibility of the inherited method from Lion
	}
	 protected void animal() {
			System.out.println("this is private animal method");
			// private method is satisfying protected, default, public methods when overridden as protected, default, public.  
	}
	 public void sand() {
			System.out.println("this is protected sand method");
			// protected method is overriding as public method but can not overridden as private, default method. 
	 }	
	 
	protected void mud() {
		 System.out.println("let see in comment");
		 // default method can override as public and protected but cannot as private
	 }
}