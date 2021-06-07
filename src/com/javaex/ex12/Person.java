package com.javaex.ex12;

public class Person {

	//필드
	private String name;
	private int age;

	
	
	//생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	//메소드g/s	
	//getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드-일반
	
	public void showInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
	
	
	
	
}
