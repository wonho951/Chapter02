package com.javaex.ex14;//자식

public class Student extends Person{
//extends 부모  ---> 상속받는 예약어
	
	
	//필드
	private String schoolName;
	
	//생성자	
	public Student() {
		//기본적으로 person의 기본 생성자 사용한거
		//person();--->super();  부모에 디폴트 생성자가 있으면 사용가능하지만 없으면 디폴트 생성자 자체 사용불가
		System.out.println("Student()");// PersonApp에서 뭐 찍히나 실험
	}
	
	/*
	//부모의 Person(2) 생성자 사용
	public Student(String name, int age, String schoolName) {
		//super(name, age);//super() ---> 부모쪽 생성자 불러오는 명령어
		
		super();  //--> 위에 super처럼 안쓰고 이렇게 사용할 수도 있음
				  // 디폴트 값이기 떄문에 부모인 person의 디폴트 생성자 들렸다 와서 Person()먼저 찍히고 Student(3)찍힘.
		
		this.schoolName = schoolName;
		System.out.println("Student(3)");// PersonApp에서 뭐 찍히나 실험
	}
	*/
	
	//부모의 Person() 생성자 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name); //부모쪽에 있는 놈 데려올땐 super 사용
		super.setAge(age);
		//this.setAge(age); ---> 부모 age가 맘에 안들때 this로 사용해서 자식에 있는거 사용가능.
		this.schoolName = schoolName; // 부모 말고 자기 자신한테 받을땐 this 사용
		System.out.println("Student(3)");// PersonApp에서 뭐 찍히나 실험
	}


	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	/* 부모쪽의 setAge가 마음에 안들경우 자식쪽에서 바꿔도 됨.(단, 이름이 같으면 부모꺼 못불러옴)
	public void setAge(int age) {
		if (age < 0) {
			super.age = 0;
		}
	}
	*/
	
	//데이터 확인용
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName +  "age  = " + getAge() + "]"; // 그냥 age를사용하면 적용 안됨. 본인 몸에 있는건 갖다 쓸수 있는데 부모에 있는 애들도 private사용된건 못씀. ---> 필드가 아닌 게터 사용하면 가능.
	}

	
	
	//메소드 -일반
	
	public void showInfo(boolean on) { // 부모랑 변수명이 같아도 파라미터가 다르면 사용가능
		System.out.println("------------------");
		System.out.println("이름 : " + super.name);
		System.out.println("나이 : " + age);
		System.out.println("학교 : " + schoolName);
		System.out.println("------------------");
	}

	
	
	
	/*선생님 필기
	//필드
	private String schoolName;

	
	//생성자
	public Student() {
		System.out.println("Student()");
	}

	
	
	/*
	//부모의 Person(2)생성자 사용
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	*/
	
	/*
	//부모의 Person()생성자 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name);
		this.setAge(age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	

	//메소드-gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드-일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("------------------------------------");
		System.out.println("이름:" + super.name);
		System.out.println("나이:" + age);
		System.out.println("학교:" + schoolName);
		System.out.println("------------------------------------");
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
