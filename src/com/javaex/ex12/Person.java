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
	
	//데이터 확인용 (단축키사용)
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//메소드-일반	
	public void showInfo() {  //화면 출력하는거(꾸미는거)라 생각하기.(만들기 힘듦, 지금은 걍 배우는단계라 단순 출력만 하는것.)
		System.out.println("----------------");
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age);
		System.out.println("----------------");
	}


	
	
	
	
}
