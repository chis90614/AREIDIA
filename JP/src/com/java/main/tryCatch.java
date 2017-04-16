package com.java.main;

public class tryCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("예외처리 메시지: "+ ae.getMessage());
		}
		
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e;
			//throw new Exception("고의로 발생시켰음"); -- 위에 두 줄을 한 줄로 간소화
		} catch (Exception e) {
			System.out.println("에러 메시지: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
		
//		int num = 100;
//		int result = 0;
//		for(int i=0;i<10;i++){
//			try {
//				result = num / (int)(Math.random()*10.0);
//				System.out.println(result);		
//			}
//			catch(Exception e){
//				System.out.println("0");
//			}
//		}
	}
}
