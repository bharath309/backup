package com.bellinfo.assignment;

import java.util.Scanner;

public class FindArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		int b; 
		int c=0;
		while (a>0) {
			
			b=a%10;				
			c=c+(b*b*b);			
			a=a/10;	
			
		}
		if(c==a) {
		System.out.println("this is an armstrong number " +c);
		}
		else {
			System.out.println("this  is not an arm strong number " + c);
		}
		
	}

}
