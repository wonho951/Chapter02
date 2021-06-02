package com.javaex.ex02;

public class Goods {

	
	//필드 (가격이 -일경우 손해 보지 않기 위해 필드영역에 접근하지 못하게 하는법도 있음)
	private String name;
	private int price;
	
	//생성자	
	
	//메소드 - (g/s)
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
	
	//메소드(일반)
	public void showInfo() {		
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("---------------------");
		
	}
		
	
}
