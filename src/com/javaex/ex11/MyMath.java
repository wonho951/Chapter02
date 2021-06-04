package com.javaex.ex11;

public class MyMath {

	//필드
	
	
	//생성자 --> 디폴트는 안만들어도 생성됨.
	
	
	//메소드(g/s)
	
	
	//메소드 - 일반   //↓↓↓↓ 메소드 오버로딩
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
	
	
}
