package com.javaex.ex09;

public class Goods {

	
	//필드 (가격이 -일경우 손해 보지 않기 위해 필드영역에 접근하지 못하게 하는법도 있음)
	private String name;
	private int price;
	private static int count;
	//생성자	
	public Goods() {  //디폴트 생성자
		count = count +1;
	}
	
	
	public Goods(String name, int price) {   // 필드 다 있는 생성자.
		super();
		this.name = name;
		this.price = price;
		count = count +1;
	}
	
	
	
	//메소드 - (g/s)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	
	//메소드(일반)
	public void showInfo() {		
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("카운트 " + count);
		System.out.println("---------------------");		
	}

	
}
