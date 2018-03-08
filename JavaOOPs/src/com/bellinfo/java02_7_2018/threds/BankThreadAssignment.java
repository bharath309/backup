package com.bellinfo.java02_7_2018.threds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

public class BankThreadAssignment {

	public static void main(String[] args) {

		
		
		Runnable bc1=new BankCustomer(400,20,"Bharath"); 
		Runnable bc2=new BankCustomer(00,20," srikanth");
		Runnable bc3=new BankCustomer(80,30,"Harsha"); 
		
		ExecutorService exec=Executors.newFixedThreadPool(3);
		exec.execute(bc1);
		exec.execute(bc2);
		exec.execute(bc3);
		/*exec.execute(bc2);
		exec.execute(bc3);
		exec.execute(bc4);
		exec.execute(bc5);*/
		exec.shutdown();
	}

}
class BankCustomer implements Runnable{
	
	/*Thread t1=null;
	BankCustomer(String name){
		t1=new Thread(this, name);
		setName();
		start();
	}*/
	private String customerName;
	private double balance;
	private double depositAmount;
	private double withdrawAmount;

	/*public void start() {
		// TODO Auto-generated method stub
		
	}
	public void setName() {
		// TODO Auto-generated method stub
		
	}   */
	

	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public BankCustomer(double depositAmount, double withdrawAmount, String customerName) {
		super();
		this.customerName=customerName;
		this.depositAmount = depositAmount;
		this.withdrawAmount = withdrawAmount;
	}
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("*******************thread Started*******************");
		//displayDepositAmount();
		displayTransactions();
		System.out.println("*******************thread Ended*******************");

	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void displayTransactions() {
		// TODO Auto-generated method stub
		balance=balance+depositAmount;
		System.out.println(customerName+" Your Deposited Amount: "+ depositAmount);
		System.out.println(customerName+" Your Total balance: " + balance);
		
		if(balance-withdrawAmount<0) {
			System.out.println(customerName+" your Account have insufficient balance ");
		}
		else {
			balance=balance-withdrawAmount;
			System.out.println(customerName+" Your Withdrawal Amount: "+withdrawAmount);
			System.out.println(customerName+" Your total balance: "+balance);
		}
	}
	/*private void displayDepositAmount() {
		// TODO Auto-generated method stub
		
	}*/

}
