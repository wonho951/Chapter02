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
		
		/*
		 * sr01.draw(); // 메소드 오버라이딩 --> 전제: 상속관계여야 한다. 부모자식 메소드명이 같을때 자식꺼를 부모한테 덮어씌운다.
		 * // ↑↑ .찍었을때 부모꺼만 보이는데 실제 적용은 자식꺼만됨. 의문 가져야함.
		 * System.out.println(sr01.toString());// 메소드 오버라이딩 --> 전제: 상속관계여야 한다. 부모자식
		 * 메소드명이 같을때 자식꺼를 부모한테 덮어씌운다. // ↑↑ .찍었을때 부모꺼만 보이는데 실제 적용은 자식꺼만됨. 의문 가져야함.
		 */
		
		//배열을 이용해서 그리기
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
						
			
			//오버라이딩을 이용해서 구현 가능
			System.out.println("넓이: " + sArray[i].area());			
		}
		
		
		
		//오버라이딩 부작용 --> 추상클래스, 추상메소드로 해결
		//이렇게 구할때가 문제--> 출력하면 0.0 나옴--> 부모클래스에 return값에 0.0이 들어가있기때문.
		Shape ss01 = new Shape("검정", "검정");
		System.out.println("넓이: " + ss01.area());
		
		
		
		System.out.println(((Rectangle)sr01).getWidth());
		//↑ 강제로 형변환 시켜서 get 사용.(시선을 바꿔줌-->재정의)
		//Rectangle sr01 = new Rectangle("빨강", "검정", 10, 10);
		//↑ 얘랑 같다고 생각하면됨.
		
		
		
		
		
		
		
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
