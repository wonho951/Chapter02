package com.javaex.ex14;
//복사할때 import 확인하기
public class PersonApp {

	public static void main(String[] args) {
			

		
		//디폴트 생성자 사용
		/*
		Student s01 = new Student();
		s01.setName("정우성");
		s01.setAge(50);
		s01.setSchoolName("서울고등학교");
		*/
		//s01.showInfo();
		
		/*
		//Student 생성자(3개)사용
		//생성자 순서 알아보기(super이 어떻게 작동하는지) (부모까지 포함)
		Student s02 = new Student("이효리", 45, "제주고등학교");
		s02.showInfo();
		*/
		
		//생성자 어떻게 작동되는지 알아보기
		//부모의 디폴트 생성자 사용->확인
		//Student s03 = new Student();
		
		Student s04 = new Student("이효리", 45, "제주고등학교");
		s04.showInfo();
		//s04.showInfo(false); --> 변수명이 같아도 파라미터가 다르면 선택가능.
		
		
		Person p = new Person();
		p.name = "바보야"; // 이걸 막기 위해서 protected 사용. 이게 다른 패키지에 있으면 사용 불가 
	}
	
	
	
	
		//선생님 필기
		//디폴드 생성자 사용
		/*
		Student s01 = new Student();
		s01.setName("정우성");
		s01.setAge(50);
		s01.setSchoolName("서울고등학교");
		*/
		//s01.showInfo();
		
		//Student 생성자(3) 사용
		//생성자 순서(부모까지 포함)
		/*
		Student s02 = new Student("이효리", 45, "제주고등학교");
		s02.showInfo();
		*/
		
		
		//부모의 디폴트 생성자 사용-->확인
		//Student s03 = new Student();
		/*
		Student s04 = new Student("이효리", 45, "제주고등학교");
		s04.showInfo();
		
		
		Person p = new Person();
		p.name ="바보야"; //다른 패키지였으면 접근하지 못한다.
		*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
