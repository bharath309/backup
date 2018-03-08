package com.bellinfo.java02_2_2018;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lap1 = new Laptop(500, "hp");
		Laptop lap2 =new Laptop(400,"hp");
		
		System.out.println(lap1.equals(lap2));
	}

}

class Laptop{
	private int price;
	private String brand;
	public Laptop(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", brand=" + brand + "]";
	}
//	public boolean equals(Object obj) {
//		if (obj instanceof  Laptop) {
//			Laptop lap=(Laptop)obj;
//			if (this.price==lap.getPrice() && this.brand.equals(lap.getBrand())) {
//			return true;
//			}
//		}
//		return false;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}