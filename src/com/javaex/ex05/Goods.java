package com.javaex.ex05;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	
	//생성자
	//이름은 필드 이름으로 정해져있음(못바꿈)
	//void나 return자리도 없으면 그냥 메소드임.
	//내부 소스코드 없으면 자동으로 만들지 않아도 있는걸로 인식함.
	//생성자 복수일때 디폴트 생성자 생성 안하면 오류남.
	
	public Goods() {
		//Goods를 메모리(힙)에 올리는거
	}
	
	
	public Goods(String name, int price) { //--> 메모리에 한방에 올림.자료형의 순서가 다르면 다른걸로 인식함.적용가능.
		//Goods를 메모리(힙)에 올리는거
		this.name = name;
		this.price = price;
	}
	
	
	
	//메소드(게터세터)
	//단축키 있는데 안먹힘 (alt+shift+s)-->source ->Generate getter setter들어가서 함
	//alt+s+r 누르면 됨
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	
	
	//메소드 - 일반
	public void showInfo() {
	System.out.println("상품이름 :" + name);
	System.out.println("가격 : " + price);
	System.out.println("===============");
	}


	
	
}
