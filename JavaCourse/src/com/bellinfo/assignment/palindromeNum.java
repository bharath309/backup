package com.bellinfo.assignment;

import java.util.Scanner;

public class palindromeNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("enter number: ");
		long x =input.nextInt();
		long xr=0;
		long xv=x;
		while(x>0) {
			
			xr=xr*10+x%10;
					x=x/10;
		}
		System.out.println(xr);
		if (xv==xr) {
			System.out.println("this number is palindrome number");
		}
		else {
			System.out.println("this not palindrome");
		}

	}

}
