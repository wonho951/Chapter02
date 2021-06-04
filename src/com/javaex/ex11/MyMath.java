package com.javaex.ex11;

public class MyMath {

	//필드
	private static double pi = 3.14;
	
	//생성자 --> 디폴트는 안만들어도 생성됨.
	
	
	//메소드(g/s)
	
	
	//메소드 - 일반   //↓↓↓↓ 메소드 오버로딩
	//메소드를 static으로 해두면 필드도 static 선언해야 사용가능.
	public static int plus(int a, int b) { //스태틱 영역에 올림.
	
	int result = a + b; // 복잡한 계산식 가정
	
	return result; 
	}
	
	public static double plus(double a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double plus(double a, int b) {
		double result = a + b;
		return result;
	}
	
	
	
	//원의 넓이 구하는거
	public static double cirleArea(int  radius) {
		double result = radius * radius * pi; //스태틱 선언시 바로 pi 못갖다씀
		return result;
	}
	
}
