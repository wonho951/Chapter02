package com.javaex.ex13;

public class Student extends Person{
//extends 부모  ---> 상속받는 예약어
	
	
	//필드
	private String schoolName;
	
	//생성자	
	public Student() {
	
	}
	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}



	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//데이터 확인용
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName +  "age  = " + getAge() + "]"; // 그냥 age를사용하면 적용 안됨. 본인 몸에 있는건 갖다 쓸수 있는데 부모에 있는 애들도 private사용된건 못씀. ---> 필드가 아닌 게터 사용하면 가능.
	}

	
	
	//메소드 -일반
	
	public void showInfo() {
		System.out.println("------------------");
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("학교 : " + schoolName);
		System.out.println("------------------");
	}

	
}
