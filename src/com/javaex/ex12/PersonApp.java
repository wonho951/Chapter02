package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		//테스트		
		Person p00 = new Person("정우성" , 46);		
		
		//toSrting ---> 필드 , 생성자, 게터세터 잘 됐는지 확인하는용.
		System.out.println(p00.toString()); 
		
		
		p00.setAge(50);
		System.out.println(p00.getAge());

		
		p00.showInfo();
	}

}
