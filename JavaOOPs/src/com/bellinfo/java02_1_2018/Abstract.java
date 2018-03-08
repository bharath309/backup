package com.bellinfo.java02_1_2018;

public class Abstract {

	public static void main(String[] args) {
		Bank bank=new Bofa();
		bank.deposit(100);
		bank.interstCharge();
	}

}

abstract class Bank{
	public void deposit(int deposit) {
		System.out.println("Amount is deposited"+deposit);
		
	}
	public void withdrawal(int wdamt) {
		System.out.println("Amount is withdrawn "+wdamt);
	}
	
	public abstract void interstCharge();
}

class Bofa extends Bank{

	@Override
	public void interstCharge() {
		// TODO Auto-generated method stub
		System.out.println("interest is 8%");
	}
	
}