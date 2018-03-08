package com.bellinfo.assignment;

import java.util.Scanner;

public class fabinocciSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n =input.nextInt();
		int a=0;
		int b=1; 
		for(int i=0;i<n;i++) {
			
			int c=a+b;
			a=b;
			b=c;
			
			++i;
			
			
			System.out.println(a);
		}
	}

}
