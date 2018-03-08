package com.bharath.javaassign7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateExcelFilewithWeekNames {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		PrintWriter pw=new PrintWriter("abc.xls");
		WeekNames[] wn=WeekNames.values();
		
		System.out.println(wn.length);
	}

}

enum WeekNames{
	SUNDAY,MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	WeekNames(){
		
	}
}
