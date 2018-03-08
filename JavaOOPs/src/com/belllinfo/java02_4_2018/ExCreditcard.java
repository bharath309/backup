package com.belllinfo.java02_4_2018;

import java.util.Scanner;

public class ExCreditcard {

	public String validateCardType(String cardNumber, String cvv, String expDate){
		
		
		if(cardNumber==null) {
			System.out.println("enter valid cardNumber");
			throw new CustomeInvalidException("card num is not valid");
		}
	
	return null;
	}

	public static void main(String args []) {
		ExCreditcard cc=new ExCreditcard();
		try {
		cc.validateCardType(null, "453", "15/15/18");	//constructor
		}catch(CustomeInvalidException cac) {
			System.out.println("  ");
		}
	}
	
	
	
		public class CustomeInvalidException extends RuntimeException{
			public CustomeInvalidException(String message) {
				super(message);
			}
			
}


}

