package com.java.product;

public class product {
	int price;
	int point;
	
	public product(int price) {
		this.price = price;
		point = (int)(price/10.0);
	}
}