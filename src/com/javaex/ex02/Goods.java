package com.javaex.ex02;

public class Goods {

	
	//필드 (가격이 -일경우 손해 보지 않기 위해 필드영역에 접근하지 못하게 하는법도 있음)
	private String name;
	private int price;
	
	//생성자
	
	
	//메소드 - 겟터셋터
	
	
	//메소드 - 일반
	public void setName(String n) {
		
		name = n;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {		
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("---------------------");
		
	}
		
	
}
