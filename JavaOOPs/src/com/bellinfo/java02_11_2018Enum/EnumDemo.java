package com.bellinfo.java02_11_2018Enum;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day[] d=Day.values();
		for (int i=0;i<d.length;i++) {
			System.out.println(d[i]+" "+d[i].getDay()+" "+d[i].getDescrip());
		}
	}

}

enum Day{
	MONDAY(1,"boring"), TUESDAY(2,"little boring"), WEDNESDAY(3, "Little busy"), THURSDAY(4,"moderate"), FRIDAY(5), SATURDAY, SUNDAY(7,"oops");
	int day;
	String descrip;
	Day(){
		System.out.println("inside day");
	}
	Day(int day){
		System.out.println("inside argument cnstructer day" +day);
		this.day=day;
	}
	Day(int day, String descrip){
		this.day=day;
		this.descrip=descrip;
		System.out.println("moode");
	}
	public int getDay() {
		return day;
		
	}
	public String getDescrip() {
		return descrip;
	}
	
}