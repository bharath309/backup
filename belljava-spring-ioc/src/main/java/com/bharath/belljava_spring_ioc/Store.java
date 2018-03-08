package com.bharath.belljava_spring_ioc;

public class Store {
	Payments payment;
	Items items;
	public Store(Payments payment, Items items) {
		super();
		this.payment = payment;
		this.items = items;
	}
	

}
