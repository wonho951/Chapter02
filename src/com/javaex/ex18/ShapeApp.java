package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		//배열을 만든다
		Shape[] sArray = new Shape[3];
		
		//도형을 만든다
		Shape sr01 = new Rectangle("빨강", "검정", 10, 10);
		Shape sc01 = new Circle("주황", "검정", 5);
		Shape st01 = new Triangle("노랑", "검정", 30, 30);
		
		//배열<--도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;
		
				
		
		sr01.draw(); // 메소드 오버라이딩 --> 전제: 상속관계여야 한다. 부모자식 메소드명이 같을때 자식꺼를 부모한테 덮어씌운다.
		// ↑↑ .찍었을때 부모꺼만 보이는데 실제 적용은 자식꺼만됨. 의문 가져야함.
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* 
		섞어쓰기 가설 --> 배열안에 들어가나
		
		
		
		
		//도형(Shape) 배열 만든다.
		Shape[] sArray = new Shape[3];
		
		//도형 만든다.
		Rectangle r01 = new Rectangle("빨강", "검정", 10, 10);
		Circle c01 = new Circle("주황", "검정", 10);
		Triangle t01 = new Triangle("노랑", "검정", 10, 10);
		
		//배열<--사각형
		
		
		
		//배열<--원
		//배열<--삼각형
		*/
	}

}
