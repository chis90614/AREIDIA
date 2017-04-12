package com.java.product;

public class Buyer {
	public int money=1000;
	public int point;
	
	public void Buyer(product p) {
		if(money<p.price){
			System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
			return;
		}
		money-=p.price;
		point+=p.point;
		System.out.println(p+"을/를 구입하였습니다.");
	}
}
