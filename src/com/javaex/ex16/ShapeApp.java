package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		//사각형 관리
		Rectangle[] rArray = new Rectangle[3];
		
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		//System.out.println(r01.toString());  --> 데이터 테스트
		Rectangle r02 = new Rectangle("노랑", "검정", 6, 6);
		Rectangle r03 = new Rectangle("초록", "검정", 7, 7);
		
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		
		//배열을 이용한 그리기
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();			
		}
		
		/*
		//변수를 이용한 변색 변경
		r01.setFillColor("파랑");	//배열 아닐시 일일히 다 바꿔줘야함
		r02.setFillColor("파랑");	//관리가 힘듦
		r03.setFillColor("파랑");
		*/
		
		/*
		//배열을 이용한 면색 변경
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].setFillColor("파랑");  //한번에 관리 가능
		} 
		
		
		//배열을 이용한 그리기
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();			
		}
		
		
		/*
		변수를 이용한 출력--> 불편
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
		
		
		//원 관리
		//변수 사용해서 그리기		
		Circle c01 = new Circle("빨강", "검정", 11);
		Circle c02 = new Circle("노랑", "검정", 22);
		Circle c03 = new Circle("초록", "검정", 33);
		//System.out.println(c01.toString()); --> 데이터 테스트
		
		//변수 사용해서 그리기
		c01.draw();
		c02.draw();
		c03.draw();
		
		System.out.println("------------------------------------------------");
		//원관리
		//배열 사용해서 그리기
		Circle[] cArray = new Circle[3];
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//배열을 이용한 원 그리기
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
		System.out.println("------------------------------------------------");
		//배열 사용 면색 한번에 변경
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].setFillColor("분홍");
		}
		
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
