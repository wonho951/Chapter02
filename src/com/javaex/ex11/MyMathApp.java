package com.javaex.ex11;

public class MyMathApp {
	//static 조사
	public static void main(String[] args) {
		
		/*
		MyMath myMath = new MyMath();

		System.out.println(myMath.plus(100, 100));
		
		System.out.println(myMath.plus(100.5, 100.2));
		*/
		
		
		
		System.out.println(MyMath.plus(99, 99));		
		System.out.println(MyMath.plus(10.1, 12.4));
		
		System.out.println(MyMath.cirleArea(5));
		
		MyMath myMath = new MyMath();//이렇게 쓸 이유가 없음
		System.out.println(myMath.plus(100, 100));
		
	}

}
