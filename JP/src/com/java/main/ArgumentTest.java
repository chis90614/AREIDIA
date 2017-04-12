package com.java.main;

class product {
	int price;
	int point;
	
	public product(int price) {
		this.price = price;
		point = (int)(price/10.0);
	}
}

class Tv extends product{
	Tv(){
		super(100);
	}
	public String toString(){
		return "Tv";
	}
}

class Computer extends product{
	Computer(){
		super(200);
	}
	public String toString(){
		return "Com";
	}
}

class Buyer {
	int money=1000;
	int point;
	
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

public class ArgumentTest {

}
