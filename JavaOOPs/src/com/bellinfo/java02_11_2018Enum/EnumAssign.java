package com.bellinfo.java02_11_2018Enum;

public class EnumAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction[] dir=Direction.values();
		House[] h=House.values();
		Room r=new Room();
		
		
		for(int i=0;i<dir.length;i++) {
			
			if (i==1) {
				System.out.println(dir[i].getDescription()+h[1].getDescripti()+r.bed());
			}
		}
	}
	

}
enum Direction{
	EAST("East direction working for"), WEST("West direction working for"), NORTH("North direction working for"), SOUTH("South direction working for"), NORTHEAST("Northeast direction working for"),NORTHWEST("Northwest direction working for"),SOUTHEAST("Southeast direction working for"),SOUTHWEST("Southwest direction working for");
	String description;
	Direction(String description){
		this.description=description;
	}
	public String getDescription() {
		return description;
	
	}
}
enum House{
	MASTERBEDROOM(" 0"), CHILDBEDROOM("West direction working for"), DININGHALL("North direction working for"), KITCHEN("South direction working for"), HALL("Northeast direction working for"),BATHROOM("Northwest direction working for"),HOUSEFACEING("Southeast direction working for");
	String descripti;
	House(String descripti){
		this.descripti=descripti;
	}
	public String getDescripti() {
		return descripti;
	
	}
}
class Room{
	public int bed() {
		System.out.println("my bed is aswome");
		return 10;
	}
}
