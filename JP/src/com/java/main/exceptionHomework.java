package com.java.main;

import java.util.Scanner;

public class exceptionHomework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력하세요!");
		
		try{
			int num = sc.nextInt();
			checkNum(num);
		}
		catch(numException ne){
			System.out.println("에러메시지: "+ne.getMessage());
			ne.printStackTrace();
			System.out.println("수의 범위가 벗어났습니다.");
		}
	}
	static void checkNum(int num) throws numException{
		if(num<0 || 9<num)
			throw new numException("수 이탈! ");
	}
}
class numException extends Exception{
	public numException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}