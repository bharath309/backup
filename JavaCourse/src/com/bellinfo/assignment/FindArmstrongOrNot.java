package com.bellinfo.assignment;

import java.util.Scanner;

public class FindArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b=0;
		while(a>0) {
			b=a%10;
			a=a/10;
			++b;
		}
		System.out.println(b);
	}

}
