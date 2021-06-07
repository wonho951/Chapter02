package com.javaex.ex12;

public class Student {

	//필드
	private String Name;
	private int age;
	private String schoolName;
	
	//생성자
	public Student(String name, int age, String schoolName) {
		super();
		Name = name;
		this.age = age;
		this.schoolName = schoolName;
	}


	
	//메소드g/s
	//getter
	public String getName() {
		return Name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSchoolName() {
		return schoolName;
	}

	//setter
	public void setName(String name) {
		Name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	//데이터 확인용
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
	
	
	//메소드 -일반
}
