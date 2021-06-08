package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		//부모 클래스 테스트
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());		
		s01.draw();
		
		//사각형 테스트
		Rectangle r01 = new Rectangle(3, 3); // 자식에 있는 생성자 사용
		System.out.println(r01.toString());
		
		
		//사각형 테스트2
		//부모 생성자도 같이 사용
		Rectangle r02 = new Rectangle("빨강", "검정", 3, 3);//생성자 순서 Shape(2)--> Rectangle(4) 이 순서로 찍힘
		System.out.println(r02.toString());	//Rectangle에 toString 없으면 부모의 toString 불러옴. 그래서 오류 안남.
		r02.draw();
		

		 
	}

}
