package com.bellinfo.assignment;

import java.util.Scanner;

public class FindPerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int sum =0;
		for (int i=1; i<x; i++) {
			
			if(x%i==0) {
			sum=sum+i;
			}
		}
	if(sum==x) {
		System.out.println("This the perfect number");
	}
	else {
		System.out.println("this is not perfect number");
	}

	}

}
