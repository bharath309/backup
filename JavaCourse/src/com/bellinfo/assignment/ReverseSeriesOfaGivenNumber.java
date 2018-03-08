package com.bellinfo.assignment;
import java.util.Scanner;
public class ReverseSeriesOfaGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("enter number: ");
		long x =input.nextInt();
		long xr=0;
		while(x>0) {
			
			xr=xr*10+x%10;
					x=x/10;
		}
		System.out.println(xr);

	}

}
