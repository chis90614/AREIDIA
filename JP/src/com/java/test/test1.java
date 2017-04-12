package com.java.test;
import com.java.product.*;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		b.Buyer(new Tv());
		b.Buyer(new Computer());
		
		System.out.println("현재 남은 돈은 "+b.money+"만원 입니다.");
		System.out.println("현재 남은 포인트는 "+b.point+"점 입니다.");
	}
}
