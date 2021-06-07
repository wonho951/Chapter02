package com.javaex.ex15;

public class ColorPoint extends Point {

	//필드
	private String color;

	
	//생성자
	public ColorPoint(String color) {
		super();
		this.color = color;
	}


	//메소드 g/s
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	
	//메소드-데이터 확인
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	
	
	//메소드-일반
	public void showInfo() {
		System.out.println("x = " + super.getX() + " y = " + super.getY());
	}
}
