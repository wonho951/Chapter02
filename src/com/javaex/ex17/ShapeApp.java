package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		//부모 클래스 테스트
		Shape s01 = new Shape("빨강", "검정");
		//System.out.println(s01.toString());		
		s01.draw();
		*/
		//사각형 테스트
		/*
		Rectangle r01 = new Rectangle(3, 3); // 자식에 있는 생성자 사용
		System.out.println(r01.toString());
		*/
		
		//사각형 테스트2
		//부모 생성자도 같이 사용
		/*
		Rectangle r02 = new Rectangle("빨강", "검정", 3, 3);//생성자 순서 Shape(2)--> Rectangle(4) 이 순서로 찍힘
		System.out.println(r02.toString());	//Rectangle에 toString 없으면 부모의 toString 불러옴. 그래서 오류 안남.
		r02.draw();
		*/
		/////////////////////////////////////////////////
				
		
		//배열만들기		
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형 만들기
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3); 
		Rectangle r02 = new Rectangle("주황", "검정", 4, 4);
		Rectangle r03 = new Rectangle("초록", "검정", 5, 5);
		
		//배열 <--- 사각형
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
				
      
		//////////////원그리기/////////////////////////////////////
		//상속된자식클래스 테스트 - 원테스트
		Circle c00 = new Circle("빨강","검정", 5);
		System.out.println(c00.toString());
		c00.draw();
		
		//원 관리
		//배열만들기
		Circle[] cArray = new Circle[3];		
		//원 만들기
		Circle c01 = new Circle("빨강", "검정", 3); 
		Circle c02 = new Circle("주황", "검정", 4);
		Circle c03 = new Circle("초록", "검정", 5);
      
		//배열 안에 원 넣기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//배열을 통해서 그리기(출력하기)
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		System.out.println("↑↑↑↑↑↑↑원↑↑↑↑↑↑↑");
		////////////////////////////
      
		
      
		//상속된자식클래스 테스트 - 삼각형 테스트
		Triangle t00 = new Triangle("빨강","검정", 5, 5);
		System.out.println(t00.toString());
		t00.draw();
		//삼각형 관리
		//배열만들기
		Triangle[] tArray = new Triangle[3];
		//삼각형 만들기
		Triangle t01 = new Triangle("빨강", "검정",5, 5); 
		Triangle t02 = new Triangle("주황", "검정", 6, 6);
		Triangle t03 = new Triangle("초록", "검정", 7, 7);
		//배열 안에 삼각형 넣기
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		//배열을 통해서 그리기(출력하기)
		for(int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
		System.out.println("↑↑↑↑↑↑↑삼각형↑↑↑↑↑↑↑");

		
	}

}
