package com.bharath.jdbc;

public class Invoice {
	int id;
	String cname;
	String pname;
	double cost;
	double discount;
	String transaction;
	
	public Invoice(int id, String cname, String pname, double cost, double discount, String transaction) {
		super();
		this.id = id;
		this.cname = cname;
		this.pname = pname;
		this.cost = cost;
		this.discount = discount;
		this.transaction = transaction;
	}

	public int getId() {
		return id;
	}

	public String getCname() {
		return cname;
	}

	public String getPname() {
		return pname;
	}

	public double getCost() {
		return cost;
	}

	public double getDiscount() {
		return discount;
	}

	public String getTransaction() {
		return transaction;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", cname=" + cname + ", pname=" + pname + ", cost=" + cost + ", discount="
				+ discount + ", transaction=" + transaction + "]";
	}

	

}
