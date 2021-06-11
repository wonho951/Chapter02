package com.javaex.ex21;

public class Ex01 {

	public static void main(String[] args) {
		//	NullPointerException
		
		/*
		//에러 상황 발생
		Rectangle r01 = new Rectangle("빨강", "검정", 5 ,5);
		
		r01 = null;
		
		r01.draw();  //여기서 문제가 생긴거임.(주소값이 null이기 때문에)
		*/
		
		
		
		//해결법
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5 ,5);
		
		r01 = null;
		
		
		try {
			r01.draw(); //r01 값이 null임
		} catch (NullPointerException e) {	// 부모 자식 관계로 Exception이 부모고 그 밑에 NullPointerException같은게 있다고 생각하기. 메모리맵으로 생각
			System.out.println(e.getMessage());
			
		/*
		r01 = new Rectangle("빨강", "검정", 5 ,5); //강제로 새로운 주소 넣어주기
		r01.draw();  // 그랬을 때 실행됨.
		System.out.println("Null 포인트"); //실행 불가할때 출력
		*/
			
			
			
			
			
		//ArrayIndexOutOfBoundsException
		//배열을 참조하는 인덱스가 잘못된 경우 (배열 방번호 잘못줄경우)
		/*
		int[] intArray = new int[3];
		
		intArray[0] = 0;
		intArray[1] = 1;
		intArray[2] = 2;
		
		System.out.println(intArray[3]); //배열 2번방까지있는데 3번방 출력하라해서 오류남
		*/
		
		
		//해결법
		int[] intArray = new int[3];
		
		intArray[0] = 0;
		intArray[1] = 1;
		intArray[2] = 2;
		
		
		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
			
			
			
			
			
			
		}
		
		
		
	}

}
